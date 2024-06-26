package br.com.fujideia.iesp.tecback.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Serie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String titulo;
    private String descricao;
    private String ano;
    private String duracao;
    private String relevancia;
    private String sinopse;
    private String trailer;

    @ManyToOne
    @JoinColumn(name = "genero_id", nullable = false)
    private Genero genero;
}
