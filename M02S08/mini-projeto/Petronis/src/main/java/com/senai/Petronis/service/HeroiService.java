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
        return heroiRepository.findAll();
    }

    public Heroi inserir(Heroi heroi) {
        heroi = heroiRepository.save(heroi);
        return heroi;
    }

}
