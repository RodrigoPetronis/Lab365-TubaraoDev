package com.senai.Petronis.controller;

import java.net.URI;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.senai.Petronis.model.Heroi;

@RestController
@RequestMapping("herois")
public class HeroiController {

    @GetMapping
    public ResponseEntity <List<Heroi>> listar(){
        Heroi heroi = heroiService.consultar();
        return ResponseEntity.ok().body(herois);
    }

    @PostMapping
    public ResponseEntity <Heroi> cadastrar (@RequestBody Heroi heroi){
        heroi = heroiService.inserir(heroi);
        return ResponseEntity.created(URI.create(heroi.getNome())).body(heroi);
    }
}

/* Crie uma classe de Controller (RestController) prevendo os serviços (endpoints):

Criar um herói (método HTTP POST)

Consultar heróis (método HTTP GET) */