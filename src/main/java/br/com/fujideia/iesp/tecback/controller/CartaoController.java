package br.com.fujideia.iesp.tecback.controller;

import br.com.fujideia.iesp.tecback.model.Cartao;
import br.com.fujideia.iesp.tecback.model.Filme;
import br.com.fujideia.iesp.tecback.service.CartaoService;
import br.com.fujideia.iesp.tecback.service.FilmeService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/cartao")
public class CartaoController {
    private CartaoService service;

    @PostMapping
    public Cartao salvar(@RequestBody Cartao cartao){
        return service.salvar(cartao);
    }

    @PutMapping
    public Cartao atualizar(@RequestBody Cartao cartao){
        return service.atualizar(cartao);
    }

    @GetMapping
    public List<Cartao> listarTodos(){
        return service.listarTodos();
    }

    @GetMapping("/{id}")
    public Cartao buscarPorId(@PathVariable Integer id){
        return service.buscarPorId(id);
    }

    @DeleteMapping("/{id}")
    public void excluirPorId(@PathVariable Integer id){
        service.excluir(id);
    }
}
