package br.gov.sp.fatec.projeto_spring_2024.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.annotation.JsonView;

import br.gov.sp.fatec.projeto_spring_2024.entity.Anotacao;
import br.gov.sp.fatec.projeto_spring_2024.entity.View;
import br.gov.sp.fatec.projeto_spring_2024.repository.AnotacaoRepository;

@RestController
@RequestMapping(value = "/anotacao")
@CrossOrigin
public class AnotacaoController {

    @Autowired
    private AnotacaoRepository repo;

    @GetMapping
    @JsonView(View.ViewAnotacao.class)
    public List<Anotacao> buscarTodas() {
        return repo.findAll();
    }
    
}