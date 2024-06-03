package br.com.fujideia.iesp.tecback.controller;

import br.com.fujideia.iesp.tecback.service.TmdbService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TmdbController {

    private final TmdbService tmdbService;

    public TmdbController(TmdbService tmdbService) {
        this.tmdbService = tmdbService;
    }

    @GetMapping("/movies/popular")
    public String getPopularMovies() {
        return tmdbService.getPopularMovies();
    }
}

