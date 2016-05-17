package hv.com.app.service.impl;

import hv.com.app.dao.EmployeeDAO;
import hv.com.app.model.Employee;
import hv.com.app.service.EmployeeService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeDAO dao;
	
	@Override
	public List<Employee> getAllEmployee() {
		return dao.findAll();
	}

	@Override
	public Employee getEmployeeById(int id) {
		return dao.findById(id);
	}

	@Override
	public List<Employee> searchEmployeeByName(String name) {
		return dao.searchByName(name);
	}

	@Override
	public List<Employee> searchEmployeeByJoinDate(String joinDate) {
		return dao.searchByJoinDate(joinDate);
	}

	@Override
	public boolean saveOrUpdateEmployee(Employee employee) {
		return dao.saveOrUpdate(employee);
	}

	@Override
	public boolean deleteEmployee(int id) {
		return dao.delete(id);
	}
}
