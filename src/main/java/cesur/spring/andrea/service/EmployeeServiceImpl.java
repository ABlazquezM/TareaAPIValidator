package cesur.spring.andrea.service;

import java.util.ArrayList;
import java.util.Arrays;

import cesur.spring.andrea.model.Employee;

public class EmployeeServiceImpl implements EmployeeService{
	
	
	ArrayList<Employee> listaEmpleados = (new ArrayList<>(Arrays.asList(new Employee(1,"Esther","esther@gmail.com","EMP-RRH-125"),new Employee(2,"Anna","anna@gmail.com","EMP-VTS-221"),new Employee(3,"Mario","mario@gmail.com","EMP-FNZ-527"))));
	

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
	public Employee modificarEmpleados(Employee p) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void eliminarEmpleado(int id) {
		// TODO Auto-generated method stub
		
	}

}
