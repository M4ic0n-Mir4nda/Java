package br.com.maicon.minicurso_spring.user;

import java.time.LocalDateTime;
// import java.util.UUID;

import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.Column;
// import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
// import lombok.Getter;
// import lombok.Setter;

// @Getter  Para colocar somente os getters
// @Setter Para colocar somente os setters

@Data // Para colocar todos os getters e setters dos atributos da classe
      // automaticamente
@Entity(name = "user") // Referencia/Associa a uma tabela do banco de dados além disso cria as colunas
                       // caso não exista
public class UserModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    // @Id
    // @GeneratedValue(generator = "UUID") // É um gerador de ID automatico com //
    // uma sequencia aleatorio de letras e numeros para cada dado.

    // private UUID id;

    // @Getter > Colocar desta maneira você pega somente esse atributo em especifico
    // assim como se quiser somente o @Setter.

    // @Column(name = "usuario") // Neste caso o nome do atributo é username porem
    // no banco de dados a coluna é usuario, então você consegue utilizar um nome
    // diferente do atributo para o banco de dados

    @Column(unique = true) // Define um que será um atributo unico
    private String username;
    private String name;
    private String password;

    @CreationTimestamp // Define uma data de quando o dado foi gerado
    private LocalDateTime createdAt;

}
