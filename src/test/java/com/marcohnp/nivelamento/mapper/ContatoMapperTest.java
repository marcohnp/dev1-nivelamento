package com.marcohnp.nivelamento.mapper;

import com.marcohnp.nivelamento.stub.ContatoModelStub;
import com.marcohnp.nivelamento.stub.entity.ContatoEntityStub;
import com.marcohnp.nivelamento.stub.request.ContatoRequestStub;
import com.marcohnp.nivelamento.stub.response.ContatoResponseStub;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ContatoMapperTest {

    @Test
    void mapToResponse() {
        assertEquals(ContatoResponseStub.createContatoResponse(),
                ContatoMapper.mapToResponse(ContatoModelStub.createContatoModel()));
    }

    @Test
    void mapToModel() {
        assertEquals(ContatoModelStub.createContatoModel(),
                ContatoMapper.mapToModel(ContatoEntityStub.createContatoEntity()));
    }

    @Test
    void mapRequestToModel() {
        assertEquals(ContatoModelStub.createContatoModel(),
                ContatoMapper.mapRequestToModel(ContatoRequestStub.createContatoRequest()));
    }

    @Test
    void mapToEntity() {
        assertEquals(ContatoEntityStub.createContatoEntity(),
                ContatoMapper.mapToEntity(ContatoModelStub.createContatoModel()));
    }

}