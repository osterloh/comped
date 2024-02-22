package br.com.senai.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@Controller
@RestController
@RequestMapping("/pessoa")
public class PessoaController {

    @GetMapping
    public List<String> listPessoas(){
        List<String> nomes = new ArrayList<>();

        nomes.add("Lucas");
        nomes.add("Camily");
        nomes.add("Alex");
        nomes.add("Leandro");
        nomes.add("Arthur");

        return nomes;
    }
}
