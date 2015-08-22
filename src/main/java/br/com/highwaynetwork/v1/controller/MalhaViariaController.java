package br.com.highwaynetwork.v1.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import br.com.highwaynetwork.model.Grafo;



/**
 * @author luis vieira
 * Classe expõe o serviço de cadastro de malha viária
 */
@RestController
@RequestMapping(value = "v1/malhaviaria")
public class MalhaViariaController {
	
	private final Logger logger = LoggerFactory.getLogger(MalhaViariaController.class);
	
    @RequestMapping(method = RequestMethod.POST)
    @ResponseStatus(HttpStatus.CREATED)
    Grafo create(@RequestBody @Validated  Grafo grafo) {
        return grafo;
    }
	
	
}
