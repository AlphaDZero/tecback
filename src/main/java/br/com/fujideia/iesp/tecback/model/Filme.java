package br.com.fujideia.iesp.tecback.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Filme {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String titulo;
    private String descricao;
<<<<<<< HEAD
    private String ano;
    private String duracao;
    private String relevancia;
    private String sinopse;
    private String trailer;

    @ManyToOne
    @JoinColumn(name = "genero_id", nullable = false)
    private Genero genero;
=======
    @Transient
    private Integer anoLancamento;



>>>>>>> bda92f38645ab01a1a1988a85a603e367369c500
}
