package atividade;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter

public class Livro extends Midia{
    private String autor;
    private String editora;
    private int numero_paginas;

}