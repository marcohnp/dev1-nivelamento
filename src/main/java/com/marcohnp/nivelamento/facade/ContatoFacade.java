package com.marcohnp.nivelamento.facade;

import com.marcohnp.nivelamento.mapper.ContatoMapper;
import com.marcohnp.nivelamento.model.request.ContatoRequest;
import com.marcohnp.nivelamento.model.response.ContatoResponse;
import com.marcohnp.nivelamento.service.ContatoService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@AllArgsConstructor
@Component
public class ContatoFacade {

    private final ContatoService service;

    public ContatoResponse insert(ContatoRequest request) {
        return ContatoMapper.mapToResponse(service.insert(ContatoMapper.mapRequestToModel(request)));
    }

    public List<ContatoResponse> findAll() {
        return service.findAll().stream().map(ContatoMapper::mapToResponse).collect(Collectors.toList());
    }
}
