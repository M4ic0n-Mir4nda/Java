package br.com.maicon.minicurso_spring.task;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/tasks")
public class TaskController {

    @Autowired
    private ITaskRepository taskRepository;

    @PostMapping("/")
    public ResponseEntity create(@RequestBody TaskModel taksModel, HttpServletRequest request) {
        var idUser = request.getAttribute("idUser");
        taksModel.setIdUser((Integer) idUser);

        var currentDate = LocalDateTime.now();
        if (currentDate.isAfter(taksModel.getStartAt()) || currentDate.isAfter(taksModel.getEndAt())) { // Validação de
                                                                                                        // datas, a data
                                                                                                        // de
                                                                                                        // inicio/final
                                                                                                        // deve ser
                                                                                                        // maior que a
                                                                                                        // data atual
            return ResponseEntity.status(HttpStatus.BAD_GATEWAY)
                    .body("A data do início / data de término deve ser maior do que a data atual.");
        }

        if (taksModel.getStartAt().isAfter(taksModel.getEndAt())) {
            return ResponseEntity.status(HttpStatus.BAD_GATEWAY)
                    .body("A data de início deve ser menor do que a data de término.");
        }

        var task = this.taskRepository.save(taksModel);
        return ResponseEntity.status(200).body(task);
    }

    @GetMapping("/")
    public List<TaskModel> list(HttpServletRequest request) {
        var idUser = request.getAttribute("idUser");
        var tasks = this.taskRepository.findByIdUser((Integer) idUser);
        return tasks;
    }

    @PutMapping("/{id}")
    public TaskModel update(@RequestBody TaskModel taskModel, @PathVariable Integer id, HttpServletRequest request) {
        var idUser = request.getAttribute("idUser");
        taskModel.setIdUser((Integer) idUser);
        taskModel.setId(id);
        return this.taskRepository.save(taskModel);
    }

}
