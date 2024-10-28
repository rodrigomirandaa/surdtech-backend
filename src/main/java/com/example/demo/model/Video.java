package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "videos")
@AllArgsConstructor
@NoArgsConstructor

public class Video {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idVideo;
    private String url;
    private String titulo;
    private String descricao;
    
}
