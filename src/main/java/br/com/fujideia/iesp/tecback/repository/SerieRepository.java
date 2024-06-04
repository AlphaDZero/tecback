package br.com.fujideia.iesp.tecback.repository;

import br.com.fujideia.iesp.tecback.model.Filme;
import br.com.fujideia.iesp.tecback.model.Serie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface SerieRepository extends JpaRepository<Serie, Integer> {

    @Query("SELECT f FROM Serie f ORDER BY f.titulo")
    List<Serie> findByTituloAsc();

    @Query("SELECT f FROM Serie f ORDER BY f.genero.nome")
    List<Serie> findByGeneroAsc();
}
