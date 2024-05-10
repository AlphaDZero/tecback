package br.com.fujideia.iesp.tecback.controller;

import br.com.fujideia.iesp.tecback.model.Endereco;
import br.com.fujideia.iesp.tecback.model.Filme;
import br.com.fujideia.iesp.tecback.service.EnderecoService;
import br.com.fujideia.iesp.tecback.service.FilmeService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/endereco")
public class EnderecoController {
    private EnderecoService service;

    @PostMapping
    public Endereco salvar(@RequestBody Endereco endereco){
        return service.salvar(endereco);
    }

    @PutMapping
    public Endereco atualizar(@RequestBody Endereco endereco){
        return service.atualizar(endereco);
    }

    @GetMapping
    public List<Endereco> listarTodos(){
        return service.listarTodos();
    }

    @GetMapping("/{id}")
    public Endereco buscarPorId(@PathVariable Integer id){
        return service.buscarPorId(id);
    }

    @DeleteMapping("/{id}")
    public void excluirPorId(@PathVariable Integer id){
        service.excluir(id);
    }
}
