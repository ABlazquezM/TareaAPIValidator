package cesur.spring.andrea.controllers;

import java.net.URI;
import java.util.ArrayList;

import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import cesur.spring.andrea.model.Employee;
import cesur.spring.andrea.service.EmployeeService;

@RestController
@RequestMapping("/empleados")
public class EmployeeRestController {

	EmployeeService employeeService;

	public EmployeeRestController(EmployeeService employeeService) {
		this.employeeService = employeeService;
	}

	@GetMapping
	public ResponseEntity<ArrayList<?>> listadoEmpleados() {
		ArrayList<Employee> empleados = employeeService.muestraEmpeleados();
		return ResponseEntity.ok(empleados);
	}

	@PostMapping
	public ResponseEntity<Employee> crearEmpleado(@RequestBody @Validated Employee e) {
		employeeService.crearEmpleados(e);

		URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(e.getId()).toUri();

		return ResponseEntity.created(location).build();
	}

	@PutMapping
	public ResponseEntity<Employee> modificarEmpleado(@RequestBody @Validated Employee e) {
		employeeService.modificarEmpleados(e);
		return ResponseEntity.ok(e);
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<?> eliminarEmpleado(@PathVariable @Validated int id) {
		employeeService.eliminarEmpleado(id);
		return ResponseEntity.noContent().build();
	}
}
