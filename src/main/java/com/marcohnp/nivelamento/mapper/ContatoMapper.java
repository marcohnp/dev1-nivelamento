package com.marcohnp.nivelamento.mapper;

import com.marcohnp.nivelamento.model.ContatoModel;
import com.marcohnp.nivelamento.model.entity.ContatoEntity;
import com.marcohnp.nivelamento.model.request.ContatoRequest;
import com.marcohnp.nivelamento.model.response.ContatoResponse;
import lombok.NoArgsConstructor;

import java.util.*;
import java.util.stream.Collectors;

@NoArgsConstructor
public class ContatoMapper {

    public static ContatoResponse mapToResponse(ContatoModel contatoModel) {
        return Optional.ofNullable(contatoModel)
                .map(model -> ContatoResponse.builder()
                        .id(model.getId())
                        .nome(model.getNome())
                        .email(model.getEmail())
                        .telefones(model.getTelefones())
                        .build())
                .orElse(null);
    }

    public static ContatoModel mapToModel(ContatoEntity contatoEntity) {
        return Optional.ofNullable(contatoEntity)
                .map(request -> ContatoModel.builder()
                        .id(request.getId())
                        .nome(request.getNome())
                        .email(request.getEmail())
                        .telefones(new ArrayList<>(request.getTelefones()))
                        .build())
                .orElse(null);
    }

    public static ContatoModel mapRequestToModel (ContatoRequest contatoRequest) {
        return Optional.ofNullable(contatoRequest)
                .map(request -> ContatoModel.builder()
                        .id(request.getId())
                        .nome(request.getNome())
                        .email(request.getEmail())
                        .telefones(new ArrayList<>(request.getTelefones()))
                        .build())
                .orElse(null);
    }


    public static ContatoEntity mapToEntity (ContatoModel contatoModel) {
        return Optional.ofNullable(contatoModel)
                .map(request -> ContatoEntity.builder()
                        .id(request.getId())
                        .nome(request.getNome())
                        .email(request.getEmail())
                        .telefones(new HashSet<>(request.getTelefones()))
                        .build())
                .orElse(null);
    }
}
