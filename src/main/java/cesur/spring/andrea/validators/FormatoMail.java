package cesur.spring.andrea.validators;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

@Retention(RUNTIME)
@Target(FIELD)
@Constraint(validatedBy = FormatoMailValidator.class)
public @interface FormatoMail {

	String message() default "Debes ingresar un mail válido como 'mimail@gmail.com";

	Class<?>[] groups() default {};

	Class<? extends Payload>[] payload() default {};

}
