package br.com.fujideia.iesp.tecback.model;

import br.com.fujideia.iesp.tecback.validator.IdadeRange;
import br.com.fujideia.iesp.tecback.validator.SenhaRange;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nomeCompleto;
    private String dataNascimento;
    @IdadeRange(min = 12, max = 100)
    private Integer idade;
    private String email;
    @SenhaRange(min = 8, max = 50)
    private String senha;
}
