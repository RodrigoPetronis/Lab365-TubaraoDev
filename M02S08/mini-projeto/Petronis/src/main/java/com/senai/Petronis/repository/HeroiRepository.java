package com.senai.Petronis.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.senai.Petronis.model.Heroi;

@Repository
public interface HeroiRepository extends JpaRepository<Heroi,Integer> {

}
