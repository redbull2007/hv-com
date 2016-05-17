package hv.com.app.controller;

import hv.com.app.model.Employee;
import hv.com.app.service.EmployeeService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class EmployeeController {

	@Autowired
	private EmployeeService service;
	
	@RequestMapping(value="/test", method = RequestMethod.GET)
	public ModelAndView newUser(ModelAndView model) {
		model.setViewName("hello");
		return model;
	}
	
	@RequestMapping(value="/home", method = RequestMethod.GET)
	public ModelAndView test(ModelAndView model) {
		model.setViewName("test");
		return model;
	}
	
	@RequestMapping(value="/insert", method = RequestMethod.GET) 
	public ModelAndView testInsert(ModelAndView model) {
		Employee employee = new Employee();
		employee.setDeptId(2);
		employee.setSalaryId(2);
		employee.setPositionId(2);
		employee.setRoleId(2);
		employee.setName("Vunh");
		employee.setCode("TPS01");
		employee.setAddress("Cu Chi");
		boolean rs = service.saveOrUpdateEmployee(employee);
		System.out.println("Test: " + rs);
		model.setViewName("test");
		return model;
	}
}
