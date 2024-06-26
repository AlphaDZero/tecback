package br.com.fujideia.iesp.tecback.service;

import br.com.fujideia.iesp.tecback.model.Cartao;
import br.com.fujideia.iesp.tecback.model.Filme;
import br.com.fujideia.iesp.tecback.repository.CartaoRepository;
import br.com.fujideia.iesp.tecback.repository.FilmeRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class CartaoService {
    private CartaoRepository repository;

    public Cartao salvar(Cartao cartao){
        return repository.save(cartao);
    }

    public List<Cartao> listarTodos(){
        return repository.findAll();
    }

    public Cartao atualizar(Cartao cartao){
        if(cartao.getId()==null){
            throw new RuntimeException("Cartao sem ID");
        }
        return repository.save(cartao);
    }

    public Cartao buscarPorId(Integer id){
        return repository.findById(id).get();
    }

    public void excluir(Integer id){
        repository.deleteById(id);
    }
}
