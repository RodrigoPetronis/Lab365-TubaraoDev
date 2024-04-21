package com.senai.Petronis.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.senai.Petronis.model.Heroi;

@Repository
public class HeroiRepository {

    List<Heroi> listaHerois = new ArrayList<>();

    public List<Heroi> consultar() {
       return listaHerois;
    }

    public void adicionar(Heroi heroi) {
        listaHerois.add(heroi);
    }
}
