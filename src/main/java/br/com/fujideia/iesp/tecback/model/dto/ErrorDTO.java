package br.com.fujideia.iesp.tecback.model.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
public class ErrorDTO {
    private String key;
    private String message;
}
