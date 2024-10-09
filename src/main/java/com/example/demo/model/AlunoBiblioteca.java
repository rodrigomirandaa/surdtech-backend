package com.example.demo.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "alunos_biblioteca")
public class AlunoBiblioteca {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idBiblioteca;
    private Long alunoId;
    private Long bibliotecaId;
}