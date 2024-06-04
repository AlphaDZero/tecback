package br.com.fujideia.iesp.tecback.repository;

import br.com.fujideia.iesp.tecback.model.Filme;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FilmeRepository extends JpaRepository<Filme, Integer> {
    @Query("SELECT f FROM Filme f ORDER BY f.titulo")
    List<Filme> findByTituloAsc();

    @Query("SELECT f FROM Filme f ORDER BY f.genero.nome")
    List<Filme> findByGeneroAsc();
}
