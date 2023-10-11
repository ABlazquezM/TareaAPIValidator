package cesur.spring.andrea.validators;

import java.util.regex.Pattern;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class FormatoMailValidator implements ConstraintValidator<FormatoMail, String> {

	@Override
	public boolean isValid(String value, ConstraintValidatorContext context) {
		if (value == null) {
			return false;
		}

		return Pattern.matches("^[A-Za-z0-9_.-]{2,}@([A-Za-z0-9-]{2,}\\.){1,}[A-Za-z]{1,}$", value);
	}

}
