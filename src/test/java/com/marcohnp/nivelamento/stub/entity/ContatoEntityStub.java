package com.marcohnp.nivelamento.stub.entity;

import com.marcohnp.nivelamento.model.entity.ContatoEntity;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class ContatoEntityStub {

    public static ContatoEntity createContatoEntity() {
        return ContatoEntity.builder()
                .id(1)
                .nome("Rafael Silva")
                .email("rafael@gmail.com")
                .telefones(new HashSet<>(Arrays.asList("51981990011", "5132484359")))
                .build();
    }

    public static ContatoEntity createContatoEntityNew() {
        return ContatoEntity.builder()
                .id(2)
                .nome("Marco Pereira")
                .email("marco@gmail.com")
                .telefones(new HashSet<>(Arrays.asList("51981992222", "5132663355")))
                .build();
    }

    public static List<ContatoEntity> createContatoEntityList() {
        var list = new ArrayList<ContatoEntity>();
        list.add(createContatoEntity());
        list.add(createContatoEntityNew());
        return list;
    }
}
