package cesur.spring.andrea.model;


import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee {

	//@NumeroPositivo
	int id; // Debe ser un número positivo.
	@NotBlank
	String name; // No debe ser vacío o nulo.
	//@FormatoMail
	String email; // Debe ser un correo electrónico válido.
	//@Formatocode
	String employeeCode; //Un código de empleado que sigue un patrón específico definido con una expresión regular. Patrón del código: (Ejemplo: "EMP-dep-1234"). Crear un patrón de expresión regular (regex) para validar un código de empleado del estilo "EMP-dep-1234", donde "dep" debería ser reemplazado por las 3 primeras letras del nombre del departamento. 
	
}
