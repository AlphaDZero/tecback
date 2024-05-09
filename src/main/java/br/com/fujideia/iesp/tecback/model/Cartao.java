package br.com.fujideia.iesp.tecback.model;

import lombok.Data;

@Data
public class Cartao {
    private String numeroCartao;
    private String codigoSeguranca;
    private String validadeCartao;
    private String nomeTitular;
    private String cpf;
}
