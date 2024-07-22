package br.com.maicon.minicurso_spring.user;

import org.springframework.data.jpa.repository.JpaRepository;

// class: Classes tem atributos e metodos, e metodos de fato tem alguma implementacao
// interface: Uma interface só tem uma representacao dos metodos que tem disponivel dentro dela

public interface IUserRepository extends JpaRepository<UserModel, Integer> {
    UserModel findByUsername(String username); // Faz um select buscando a coluna "username"
}
