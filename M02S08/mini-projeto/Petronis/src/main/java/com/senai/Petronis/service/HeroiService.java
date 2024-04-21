package com.senai.Petronis.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.senai.Petronis.model.Heroi;
import com.senai.Petronis.repository.HeroiRepository;

@Service
public class HeroiService {
    
    @Autowired
    HeroiRepository heroiRepository;


    public List<Heroi> consultar() {
        return heroiRepository.consultar();
    }

    public Heroi inserir(Heroi heroi) {
        heroiRepository.adicionar(heroi);
        return heroi;
    }



}

/* 
Crie uma classe de serviço (“HeroiService”) para conter a lógica de negócio de consulta e salvar heróis.

Use os Beans e injeção de dependência do framework na implementação. */