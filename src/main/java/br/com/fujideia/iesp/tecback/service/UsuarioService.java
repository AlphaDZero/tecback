package br.com.fujideia.iesp.tecback.service;

import br.com.fujideia.iesp.tecback.model.Genero;
import br.com.fujideia.iesp.tecback.model.Usuario;
import br.com.fujideia.iesp.tecback.repository.GeneroRepository;
import br.com.fujideia.iesp.tecback.repository.UsuarioRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class UsuarioService {
    private UsuarioRepository repository;

    public Usuario salvar(Usuario usuario){
        return repository.save(usuario);
    }

    public List<Usuario> listarTodos(){
        return repository.findAll();
    }

    public Usuario atualizar(Usuario usuario){
        if(usuario.getId()==null){
            throw new RuntimeException("Usuario sem ID");
        }
        return repository.save(usuario);
    }

    public Usuario buscarPorId(Integer id){
        return repository.findById(id).get();
    }

    public void excluir(Integer id){
        repository.deleteById(id);
    }
}
