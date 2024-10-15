package com.example.demo.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.sql.Timestamp;

@Entity
@Getter
@Setter
@Table(name = "resultados_prova")
public class ResultadoProva {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idResposta;
    private Long provaId;
    private Long alunoId;
    private BigDecimal nota;
    private String comentario;
    private Timestamp dataAvalia;
}