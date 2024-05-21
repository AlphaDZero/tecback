package br.com.fujideia.iesp.tecback.controller;

import br.com.fujideia.iesp.tecback.model.Filme;
import br.com.fujideia.iesp.tecback.model.Usuario;
import br.com.fujideia.iesp.tecback.service.FilmeService;
import br.com.fujideia.iesp.tecback.service.UsuarioService;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/usuario")
public class UsuarioController {
    private UsuarioService service;

    @PostMapping
    public Usuario salvar(@Valid @RequestBody Usuario usuario){
        return service.salvar(usuario);
    }

    @PutMapping
    public Usuario atualizar(@RequestBody Usuario usuario){
        return service.atualizar(usuario);
    }

    @GetMapping
    public List<Usuario> listarTodos(){
        return service.listarTodos();
    }

    @GetMapping("/{id}")
    public Usuario buscarPorId(@PathVariable Integer id){
        return service.buscarPorId(id);
    }

    @DeleteMapping("/{id}")
    public void excluirPorId(@PathVariable Integer id){
        service.excluir(id);
    }
}
