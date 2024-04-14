package com.senai.Petronis.controller;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.senai.Petronis.model.Heroi;
import com.senai.Petronis.service.HeroiService;

@RestController
@RequestMapping("herois")
public class HeroiController {

    @Autowired
    private HeroiService heroiService;

    @GetMapping
    public ResponseEntity<List<Heroi>> listar() {
        var herois = heroiService.consultar();
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