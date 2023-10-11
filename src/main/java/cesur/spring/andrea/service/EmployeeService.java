package cesur.spring.andrea.service;

import java.util.ArrayList;

import cesur.spring.andrea.model.Employee;

public interface EmployeeService {
	
	public ArrayList<Employee> muestraEmpeleados();

	public Employee crearEmpleados(Employee p);

	public Employee modificarEmpleados(Employee p);

	public void eliminarEmpleado(int id);

}
