package br.com.fujideia.iesp.tecback.controller;

import br.com.fujideia.iesp.tecback.model.Serie;
import br.com.fujideia.iesp.tecback.repository.SerieRepository;
import br.com.fujideia.iesp.tecback.service.SerieService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/serie")
public class SerieController {
    private SerieService service;
    private SerieRepository repository;

    @PostMapping
    public Serie salvar(@RequestBody Serie serie){
        return service.salvar(serie);
    }

    @PutMapping
    public Serie atualizar(@RequestBody Serie serie){
        return service.atualizar(serie);
    }

    @GetMapping
    public List<Serie> listarTodos(){
        return service.listarTodos();
    }

    @GetMapping("/{genero}")
    public List<Serie> listarPorGenero(@RequestParam(required = false) String genero){
        return repository.findByGenero(genero);
    }

    @GetMapping("/{id}")
    public Serie buscarPorId(@PathVariable Integer id){
        return service.buscarPorId(id);
    }

    @DeleteMapping("/{id}")
    public void excluirPorId(@PathVariable Integer id){
        service.excluir(id);
    }
}
