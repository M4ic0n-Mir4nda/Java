package br.com.maicon.minicurso_spring.task;

import java.time.LocalDateTime;

import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

/*
 * ID
 * Usuário
 * Descrição
 * Titulo
 * Data de Inicio
 * Data de término
 * Prioridade
 * 
 */

@Data
@Entity(name = "task")
public class TaskModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String description;

    @Column(length = 50) // Limita a quantidade caracteres no campo
    private String title;
    private LocalDateTime startAt;
    private LocalDateTime endAt;
    private String priority;

    private int idUser;

    @CreationTimestamp
    private LocalDateTime createdAt;
}
