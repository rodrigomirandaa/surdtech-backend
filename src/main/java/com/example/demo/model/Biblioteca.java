package com.example.demo.model;

import java.security.Timestamp;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "bibliotecas")
public class Biblioteca {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idBiblioteca;
    private String nome;
    private Timestamp dataAplicacao;
}