package cesur.spring.andrea.service;

import java.util.ArrayList;
import java.util.Arrays;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import cesur.spring.andrea.model.Employee;

@Primary
@Service
public class EmployeeServiceImpl implements EmployeeService {

	ArrayList<Employee> listaEmpleados = (new ArrayList<>(
			Arrays.asList(new Employee(1, "Anna", "anna@gmail.com", "EMP-VNT-1234"),
					new Employee(2, "Mónica", "monica@gmail.com", "EMP-CNT-5456"),
					new Employee(3, "Ivan", "ivan@gmail.com", "EMP-MRK-2145"))));

	@Override
	public ArrayList<Employee> muestraEmpeleados() {
		return listaEmpleados;
	}

	@Override
	public Employee crearEmpleados(Employee e) {
		listaEmpleados.add(e);
		return e;
	}

	@Override
	public Employee modificarEmpleados(Employee e) {
		for (Employee emp : listaEmpleados) {
			if (emp.getId() == e.getId()) {
				emp.setName(e.getName());
				emp.setEmail(e.getEmail());
				return e;
			}
		}
		return null; 
	}

	@Override
	public void eliminarEmpleado(int id) {
		for (Employee emp : new ArrayList<>(listaEmpleados)) {
			if (emp.getId() == id) {
				listaEmpleados.remove(emp);
			}
		}
	}

}
