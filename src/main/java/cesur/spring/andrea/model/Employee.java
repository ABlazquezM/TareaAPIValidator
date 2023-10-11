package cesur.spring.andrea.model;

import cesur.spring.andrea.validators.FormatoMail;
import cesur.spring.andrea.validators.Formatocode;
import cesur.spring.andrea.validators.NumeroPositivo;
import jakarta.validation.constraints.NotBlank;

/*@Data
@AllArgsConstructor
@NoArgsConstructor No funcionan las anotaciones aun importando las librerías y añadiedo la dependencia en el pom*/
public class Employee {

	@NumeroPositivo
	int id;
	@NotBlank
	String name;
	@FormatoMail
	String email;
	@Formatocode
	String employeeCode;

	public Employee(int id, @NotBlank String name, String email, String employeeCode) {
		this.id = id;
		this.name = name;
		this.email = email;
		this.employeeCode = employeeCode;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getEmployeeCode() {
		return employeeCode;
	}

	public void setEmployeeCode(String employeeCode) {
		this.employeeCode = employeeCode;
	}

}
