package com.example.demo.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "materiais")
public class Materiais {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idMateria;
    private Long bibliotecaId;
    private String titulo;

    @Enumerated(EnumType.STRING)
    private TipoMaterial tipo;
    private int anoPublica;
    private String descricao;
}