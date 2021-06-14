package com.marcohnp.nivelamento.facade;

import com.marcohnp.nivelamento.service.ContatoService;
import com.marcohnp.nivelamento.stub.ContatoModelStub;
import com.marcohnp.nivelamento.stub.request.ContatoRequestStub;
import com.marcohnp.nivelamento.stub.response.ContatoResponseStub;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class ContatoFacadeTest {

    @Mock
    private ContatoService service;

    @InjectMocks
    private ContatoFacade facade;

    @Test
    void insert_must_return_success_with_a_valid_request() {
        when(service.insert(ContatoModelStub.createContatoModel())).thenReturn(ContatoModelStub.createContatoModel());
        assertEquals(ContatoResponseStub.createContatoResponse(), facade.insert(ContatoRequestStub.createContatoRequest()));
        verify(service, times(1)).insert(ContatoModelStub.createContatoModel());
    }

    @Test
    void findAll_must_return_success_with_a_valid_request() {
        when(service.findAll()).thenReturn(ContatoModelStub.createContatoModelList());
        assertEquals(ContatoResponseStub.createContatoResponseList(), facade.findAll());
        verify(service, times(1)).findAll();
    }

}