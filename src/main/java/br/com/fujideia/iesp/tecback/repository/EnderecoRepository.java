package br.com.fujideia.iesp.tecback.repository;

import br.com.fujideia.iesp.tecback.model.Endereco;
import br.com.fujideia.iesp.tecback.model.Filme;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EnderecoRepository extends JpaRepository<Endereco, Integer> {
}
