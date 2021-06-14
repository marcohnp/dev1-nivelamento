package com.marcohnp.nivelamento.service;

import com.marcohnp.nivelamento.mapper.ContatoMapper;
import com.marcohnp.nivelamento.model.ContatoModel;
import com.marcohnp.nivelamento.model.request.ContatoRequest;
import com.marcohnp.nivelamento.repository.ContatoRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@AllArgsConstructor
public class ContatoService {


    private final ContatoRepository repository;

    @Transactional
    public ContatoModel insert(ContatoModel model) {
        return ContatoMapper.mapToModel(repository.save(ContatoMapper.mapToEntity(model)));
    }
}
