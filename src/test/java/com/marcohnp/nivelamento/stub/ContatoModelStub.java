package com.marcohnp.nivelamento.stub;

import com.marcohnp.nivelamento.model.ContatoModel;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ContatoModelStub {

    public static ContatoModel createContatoModel() {
        return ContatoModel.builder()
                .id(1)
                .nome("Rafael Silva")
                .email("rafael@gmail.com")
                .telefones(Arrays.asList("51981990011", "5132484359"))
                .build();
    }

    public static ContatoModel createContatoModelNew() {
        return ContatoModel.builder()
                .id(2)
                .nome("Marco Pereira")
                .email("marco@gmail.com")
                .telefones(Arrays.asList("51981992222", "5132663355"))
                .build();
    }

    public static List<ContatoModel> createContatoModelList() {
        var list = new ArrayList<ContatoModel>();
        list.add(createContatoModel());
        list.add(createContatoModelNew());
        return list;
    }

}
