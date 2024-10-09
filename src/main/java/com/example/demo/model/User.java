package com.example.demo.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idUser;
    private String nome;
    private String email;
    private String senha;

    @Enumerated(EnumType.STRING)
    private TipoUser tipoUser;
}