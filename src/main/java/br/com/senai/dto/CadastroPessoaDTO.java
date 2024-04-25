package br.com.senai.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CadastroPessoaDTO {

    private String nome;
    private String cpf;
    private int idade;
    private Long enderecoId;
}
