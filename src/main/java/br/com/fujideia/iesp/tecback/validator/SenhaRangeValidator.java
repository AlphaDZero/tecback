package br.com.fujideia.iesp.tecback.validator;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class SenhaRangeValidator implements ConstraintValidator<SenhaRange, String> {
    private int min;
    private int max;

    @Override
    public void initialize(SenhaRange constraint) {
        this.min = constraint.min();
        this.max = constraint.max();
    }

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        if(value == null){
            return true;
        }
        return value.length() >= min && value.length() <= max;
    }
}
