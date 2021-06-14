package com.marcohnp.nivelamento.stub.request;

import com.marcohnp.nivelamento.model.request.ContatoRequest;

import java.util.Arrays;

public class ContatoRequestStub {

    public static ContatoRequest createContatoRequest() {
        return ContatoRequest.builder()
                .id(1)
                .nome("Rafael Silva")
                .email("rafael@gmail.com")
                .telefones(Arrays.asList("51981990011", "5132484359"))
                .build();
    }
}
