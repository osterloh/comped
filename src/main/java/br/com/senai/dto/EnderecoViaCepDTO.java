package br.com.senai.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class EnderecoViaCepDTO {

    private String cep;
    private String localidade;
    private String bairro;
    private String logradouro;
    private String uf;
}
