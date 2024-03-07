package br.com.senai.service;

import br.com.senai.model.Pessoa;
import br.com.senai.repository.PessoaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PessoaService {

    @Autowired
    PessoaRepository pessoaRepository;

    public List<Pessoa> listarPessoas(){
        return pessoaRepository.findAll();
    }

    public Pessoa buscarPessoaPorId(Long id){
        return pessoaRepository.findById(id).orElse(null);
    }

    public Pessoa cadastrarPessoa(Pessoa pessoa){
        return pessoaRepository.save(pessoa);
    }

    public Pessoa editarPessoa(Pessoa pessoa, Long id){
        Pessoa pessoaEntity = this.buscarPessoaPorId(id);
        pessoaEntity.setNome(pessoa.getNome());
        pessoaEntity.setCpf(pessoa.getCpf());
        pessoaEntity.setIdade(pessoa.getIdade());

        return pessoaRepository.save(pessoaEntity);
    }

    public Pessoa editarPessoaPorId(Pessoa pessoa){
        return pessoaRepository.save(pessoa);
    }

    public void excluirPessoa(Long id){
        pessoaRepository.deleteById(id);
    }

}
