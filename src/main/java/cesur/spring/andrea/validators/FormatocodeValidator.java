package cesur.spring.andrea.validators;

import java.util.regex.Pattern;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class FormatocodeValidator implements ConstraintValidator<Formatocode, String> {

	@Override
	public boolean isValid(String value, ConstraintValidatorContext context) {
		if (value == null) {
			return false;
		}

		return Pattern.matches("^EMP-[a-zA-Z]{3}-\\d{4}$", value);
	}

}
