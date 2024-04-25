package br.com.senai.controller;

import br.com.senai.dto.CadastroPessoaDTO;
import br.com.senai.dto.PessoaDTO;
import br.com.senai.model.Pessoa;
import br.com.senai.service.PessoaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RestController
@RequestMapping("/pessoa")
public class PessoaController {

    @Autowired
    PessoaService pessoaService;

    @GetMapping("/buscar_por_id/{pessoaId}")
    public Pessoa buscarPessoaPorId(@PathVariable Long pessoaId) {
        return pessoaService.buscarPessoaPorId(pessoaId);
    }

    @GetMapping
    public List<Pessoa> listarPessoas() {
        return pessoaService.listarPessoas();
    }

    @PostMapping
    public Pessoa cadastrarPessoa(@RequestBody CadastroPessoaDTO pessoa) {
        return pessoaService.cadastrarPessoa(pessoa);
    }

    @PutMapping("/{pessoaId}")
    public Pessoa editarPessoa(@RequestBody Pessoa pessoa, @PathVariable Long pessoaId) {
        return pessoaService.editarPessoa(pessoa, pessoaId);
    }

    @PutMapping("/editar_pessoa")
    public Pessoa editarPessoaPorId(@RequestBody Pessoa pessoa) {
        return pessoaService.editarPessoaPorId(pessoa);
    }

    @DeleteMapping("/{pessoaId}")
    public void excluirPessoa(@PathVariable Long pessoaId) {
        pessoaService.excluirPessoa(pessoaId);
    }

    @GetMapping("/nome-idade")
    public List<PessoaDTO> listPessoaNomeIdade() {
        return pessoaService.listarPessoaNomeIdade();
    }

//    http://localhost:8585/swagger-ui/index.html
}
