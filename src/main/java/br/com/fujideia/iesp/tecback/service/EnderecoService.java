package br.com.fujideia.iesp.tecback.service;

import br.com.fujideia.iesp.tecback.model.Endereco;
import br.com.fujideia.iesp.tecback.model.Filme;
import br.com.fujideia.iesp.tecback.repository.EnderecoRepository;
import br.com.fujideia.iesp.tecback.repository.FilmeRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class EnderecoService {
    private EnderecoRepository repository;

    public Endereco salvar(Endereco endereco){
        return repository.save(endereco);
    }

    public List<Endereco> listarTodos(){
        return repository.findAll();
    }

    public Endereco atualizar(Endereco endereco){
        if(endereco.getId()==null){
            throw new RuntimeException("Endereco sem ID");
        }
        return repository.save(endereco);
    }

    public Endereco buscarPorId(Integer id){
        return repository.findById(id).get();
    }

    public void excluir(Integer id){
        repository.deleteById(id);
    }
}
