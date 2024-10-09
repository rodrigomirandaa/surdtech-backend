package com.example.demo.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.sql.Timestamp;

@Entity
@Getter
@Setter
@Table(name = "progresso_estudante")
public class ProgressoDeEstudante {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idProgress;
    private Long alunoId;
    private Long aulaId;

    @Enumerated(EnumType.STRING)
    private StatusProgresso status;
    private Timestamp dataInicio;
    private Timestamp dataFim;
}