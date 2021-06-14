package com.marcohnp.nivelamento.service;

import com.marcohnp.nivelamento.mapper.ContatoMapper;
import com.marcohnp.nivelamento.repository.ContatoRepository;
import com.marcohnp.nivelamento.stub.ContatoModelStub;
import com.marcohnp.nivelamento.stub.entity.ContatoEntityStub;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class ContatoServiceTest {

    @Mock
    private ContatoRepository repository;

    @InjectMocks
    private ContatoService service;

    @Test
    void insert_must_return_success_with_a_valid_request() {
        when(repository.save(ContatoEntityStub.createContatoEntity())).thenReturn(ContatoEntityStub.createContatoEntity());
        assertEquals(ContatoModelStub.createContatoModel(),
                ContatoMapper.mapToModel(repository.save(ContatoEntityStub.createContatoEntity())));
        verify(repository, times(1)).save(ContatoEntityStub.createContatoEntity());
    }
}