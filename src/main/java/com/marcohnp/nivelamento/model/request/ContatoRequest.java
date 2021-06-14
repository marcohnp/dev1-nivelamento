package com.marcohnp.nivelamento.model.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotEmpty;
import java.io.Serializable;
import java.util.List;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ContatoRequest implements Serializable {

    private Integer id;
    @NotEmpty(message = "Nome do contato não pode ser nulo.")
    private String nome;
    @NotEmpty(message = "Email do contato não pode ser nulo.")
    private String email;
    @NotEmpty(message = "Pelo menos um telefone deve ser informado para o contato.")
    private List<String> telefones;
}
