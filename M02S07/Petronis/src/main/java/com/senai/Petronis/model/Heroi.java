package com.senai.Petronis.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Heroi {
    private String nome;
    private String superpoder;
    private Integer idade;
    private String cidade;
    
}
