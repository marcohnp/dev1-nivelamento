package com.marcohnp.nivelamento.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ContatoModel implements Serializable {

    private Integer id;
    private String nome;
    private String email;
    private List<String> telefones;
}
