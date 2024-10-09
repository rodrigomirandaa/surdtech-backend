package com.example.demo.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "provas")
public class Prova {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idProva;
    private String titulo;
    private String descricao;
    private Long instrutorId;
    private Long cursoId;
}