package br.com.senai.service;

import br.com.senai.model.Endereco;
import br.com.senai.repository.EnderecoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EnderecoService {

    @Autowired
    EnderecoRepository enderecoRepository;

    public List<Endereco> findEndereco(){
        return enderecoRepository.findAll();
    }

}
