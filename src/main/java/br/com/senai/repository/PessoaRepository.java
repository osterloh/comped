package br.com.senai.repository;

import br.com.senai.model.Pessoa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PessoaRepository extends JpaRepository<Pessoa, Long> {

    @Query(value = "SELECT new br.com.senai.model.Pessoa(p.nome, p.idade) FROM Pessoa p")
    List<Pessoa> listPessoaNomeIdade();
}
