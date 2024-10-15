package com.example.demo.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "aulas")
public class Aula {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idAula;
    private String titulo;
    private String descricao;
    private String videoUrl;
    private Long cursoId;
}