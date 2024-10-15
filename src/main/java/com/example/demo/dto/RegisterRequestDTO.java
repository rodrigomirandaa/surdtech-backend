package com.example.demo.dto;

import com.example.demo.model.TipoUser;

public record RegisterRequestDTO (String nome, String email, String senha, TipoUser tipoUser){
}
