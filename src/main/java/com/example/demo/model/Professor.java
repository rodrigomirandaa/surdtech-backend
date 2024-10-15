package com.example.demo.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "professores")
public class Professor {
    @Id
    private Long idProfessor;
    private String nome;
}