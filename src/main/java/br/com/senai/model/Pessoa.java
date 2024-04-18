package br.com.senai.model;

import jakarta.persistence.*;
import lombok.*;
import org.springframework.context.annotation.Lazy;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Pessoa {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private String cpf;
    private int idade;

    @ManyToOne
    private Endereco endereco;

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }
}
