package com.marcohnp.nivelamento.controller;

import com.marcohnp.nivelamento.facade.ContatoFacade;
import com.marcohnp.nivelamento.model.request.ContatoRequest;
import com.marcohnp.nivelamento.model.response.ContatoResponse;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping(value = "/v1/cliente")
@AllArgsConstructor
public class ContatoController {

    private final ContatoFacade facade;

    @PostMapping(value = "/contato")
    public ContatoResponse insert(@Valid @RequestBody ContatoRequest request) {
        return facade.insert(request);
    }

    @GetMapping(value = "/contato")
    @ResponseStatus(HttpStatus.OK)
    public List<ContatoResponse> findAll(){
        return facade.findAll();
    }
}
