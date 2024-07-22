package dio.aula.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import dio.aula.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {
    // Query Method
    List<User> findByNameContaining(String name);

    // Query Method
    User findByUsername(String username);

    // Query Override
    @Query("SELECT u FROM User u WHERE u.name LIKE %:name%")
    List<User> filtrarPorNome(@Param("name") String name);
}
