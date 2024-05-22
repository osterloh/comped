package br.com.senai.controller;

import br.com.senai.dto.EnderecoViaCepDTO;
import br.com.senai.model.Endereco;
import br.com.senai.service.BuscaCEPService;
import br.com.senai.service.EnderecoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Controller
@RestController
@RequestMapping("/endereco")
public class EnderecoController {

    @Autowired
    EnderecoService enderecoService;

    @Autowired
    BuscaCEPService buscaCEPService;

    @GetMapping
    public List<Endereco> findEndereco(){
        return enderecoService.findEndereco();
    }

    @GetMapping("/viacep/{cep}")
    public EnderecoViaCepDTO buscaCep(@PathVariable String cep) throws Exception {
        return buscaCEPService.buscaCep(cep);
    }
}
