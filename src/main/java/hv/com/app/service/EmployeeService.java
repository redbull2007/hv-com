package hv.com.app.service;

import hv.com.app.model.Employee;

import java.util.List;

public interface EmployeeService {

	public List<Employee> getAllEmployee();
	
	public Employee getEmployeeById(int id);
	
	public List<Employee> searchEmployeeByName(String name);
	
	public List<Employee> searchEmployeeByJoinDate(String joinDate);
	
	public boolean saveOrUpdateEmployee(Employee employee);
	
	public boolean deleteEmployee(int id);
}
