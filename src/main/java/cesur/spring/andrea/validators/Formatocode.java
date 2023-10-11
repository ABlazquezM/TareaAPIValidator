package cesur.spring.andrea.validators;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

@Retention(RUNTIME)
@Target(FIELD)
@Constraint(validatedBy = FormatocodeValidator.class)
public @interface Formatocode {

	String message() default "Debes ingresar un código válido con formato  'EMP-dep-123";

	Class<?>[] groups() default {};

	Class<? extends Payload>[] payload() default {};

}
