package br.com.fujideia.iesp.tecback.handler;

import br.com.fujideia.iesp.tecback.model.dto.ErrorDTO;
import jakarta.validation.ValidationException;
import lombok.extern.log4j.Log4j2;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
@Log4j2
public class CustomExceptionHandler {
    @ExceptionHandler(NullPointerException.class)
    public ResponseEntity<ErrorDTO> handleNullPointerException(NullPointerException ne){
        ErrorDTO errorDTO = ErrorDTO
                .builder()
                .key("NULL POINTER")
                .message("Error de valor nulo " + ne.getMessage())
                .build();
        return ResponseEntity.ok(errorDTO);
    }

    @ExceptionHandler(Exception.class)
    public ResponseEntity<ErrorDTO> handleException(Exception e){
        ErrorDTO errorDTO = ErrorDTO
                .builder()
                .key("EXCEPTION")
                .message("Erro Geral " + e.getMessage())
                .build();
        return ResponseEntity.ok(errorDTO);
    }
}
