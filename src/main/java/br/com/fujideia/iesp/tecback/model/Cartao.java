package br.com.fujideia.iesp.tecback.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Cartao {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String numeroCartao;
    private String codigoSeguranca;
    private String validadeCartao;
    private String nomeTitular;
    private String cpf;

    @ManyToOne
    @JoinColumn(name = "usuario_id", nullable = false)
    private Usuario usuario;

}
