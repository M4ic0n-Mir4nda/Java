package br.com.maicon.minicurso_spring.task;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ITaskRepository extends JpaRepository<TaskModel, Integer> {
    List<TaskModel> findByIdUser(Integer idUser);
}
