package cesur.spring.andrea.validators;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class NumeroPositivoValidator implements ConstraintValidator<NumeroPositivo, Integer> {

	@Override
	public boolean isValid(Integer value, ConstraintValidatorContext context) {
		return value != null && value > 0;
	}

}
