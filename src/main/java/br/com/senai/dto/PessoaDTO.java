package br.com.senai.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PessoaDTO {

    private String nome;
    private int idade;

    public PessoaDTO(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }
}
