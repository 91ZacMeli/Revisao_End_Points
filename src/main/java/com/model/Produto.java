package com.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

@ToString
@AllArgsConstructor
@Data
public class Produto {
    private String nome;
    private Double preco;
    private Double peso;

}


