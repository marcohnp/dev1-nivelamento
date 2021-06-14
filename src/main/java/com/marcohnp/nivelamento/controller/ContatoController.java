package com.marcohnp.nivelamento.controller;

import com.marcohnp.nivelamento.facade.ContatoFacade;
import com.marcohnp.nivelamento.model.request.ContatoRequest;
import com.marcohnp.nivelamento.model.response.ContatoResponse;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/contato")
@AllArgsConstructor
public class ContatoController {

    private final ContatoFacade facade;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public ContatoResponse insert(@RequestBody ContatoRequest request) {
        return facade.insert(request);
    }
}
