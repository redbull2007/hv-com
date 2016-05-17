package hv.com.app.dao;

import hv.com.app.model.Employee;

import java.util.List;

public interface EmployeeDAO {

	public List<Employee> findAll();
	
	public Employee findById(int id);
	
	public List<Employee> searchByName(String name);
	
	public List<Employee> searchByJoinDate(String joinDate);
	
	public boolean saveOrUpdate(Employee employee);
	
	public boolean delete(int id);
}
