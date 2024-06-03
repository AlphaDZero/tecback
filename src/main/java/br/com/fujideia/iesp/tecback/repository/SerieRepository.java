package br.com.fujideia.iesp.tecback.repository;

import br.com.fujideia.iesp.tecback.model.Serie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface SerieRepository extends JpaRepository<Serie, Integer> {

    @Query("SELECT f FROM Serie f WHERE f.genero = :genero")
    List<Serie> findByGenero(
            @Param("genero") String genero
    );
}
