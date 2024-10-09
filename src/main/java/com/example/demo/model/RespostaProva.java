package com.example.demo.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.sql.Timestamp;

@Entity
@Getter
@Setter
@Table(name = "respostas_prova")
public class RespostaProva {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idResposta;
    private Long provaId;
    private Long alunoId;
    private String resposta;
    private Timestamp dataRealiza;
}