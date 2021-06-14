package com.marcohnp.nivelamento.stub.response;

import com.marcohnp.nivelamento.model.response.ContatoResponse;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ContatoResponseStub {

    public static ContatoResponse createContatoResponse() {
        return ContatoResponse.builder()
                .id(1)
                .nome("Rafael Silva")
                .email("rafael@gmail.com")
                .telefones(Arrays.asList("51981990011", "5132484359"))
                .build();
    }

    public static ContatoResponse createContatoResponseNew() {
        return ContatoResponse.builder()
                .id(2)
                .nome("Marco Pereira")
                .email("marco@gmail.com")
                .telefones(Arrays.asList("51981992222", "5132663355"))
                .build();
    }

    public static List<ContatoResponse> createContatoResponseList() {
        var list = new ArrayList<ContatoResponse>();
        list.add(createContatoResponse());
        list.add(createContatoResponseNew());
        return list;
    }
}
