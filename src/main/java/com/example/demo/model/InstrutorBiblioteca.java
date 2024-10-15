package com.example.demo.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "instrutores_biblioteca")
public class InstrutorBiblioteca {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idBiblioteca;
    private Long instrutorId;
    private Long bibliotecaId;
}