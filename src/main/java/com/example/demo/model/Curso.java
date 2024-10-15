package com.example.demo.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "cursos")
public class Curso {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idCurso;
    private String nomeCurso;
    private String descricao;
    private Long instrutorId;
}