package hv.com.app.dao.impl;

import hv.com.app.dao.EmployeeDAO;
import hv.com.app.model.Employee;
import hv.com.app.model.mapper.EmployeeMapper;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

public class EmployeeDAOImpl implements EmployeeDAO {

	private JdbcTemplate jdbcTemplate;

	public EmployeeDAOImpl(DataSource dataSource) {
		jdbcTemplate = new JdbcTemplate(dataSource);
	}
	
	@Override
	public List<Employee> findAll() {
		String sql = "select * from employee";
		return jdbcTemplate.query(sql, new EmployeeMapper());
	}

	@Override
	public Employee findById(int id) {
		String sql = "select * from employee where id = ?";
		return jdbcTemplate.queryForObject(sql, new Object[] {id}, new EmployeeMapper());
	}

	@Override
	public List<Employee> searchByName(String name) {
		String sql = "select * from employee where CONVERT(name USING utf8) LIKE _utf8 '%?%' COLLATE utf8_general_ci";
		return jdbcTemplate.query(sql, new Object[] {name}, new EmployeeMapper());
	}

	@Override
	public List<Employee> searchByJoinDate(String joinDate) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean saveOrUpdate(Employee employee) {
		//INSERT INTO `hr`.`employee` (`dept_id`, `salary_id`, `position_id`, `role_id`, `name`, `code`, `phone`, `address`, `birthday`, `join_date`, `email`, `description`, `is_pass`) VALUES ('1', '1', '1', '1', 'a', 'a', '12', 'a', 'a', 'a', 'a', 'a', 1);
//UPDATE `hr`.`employee` SET `dept_id`='3', `salary_id`='3', `position_id`='3', `role_id`='3', `name`='3', `code`='3', `phone`='3', `address`='3', `birthday`='3', `join_date`='3', `email`='3', `description`='3', `is_pass`=3 WHERE `id`='1';

		String sql = "";
		if (employee.getId() > 0) {
			sql = "update employee set "
					+ "dept_id = ?, salary_id = ?, position_id = ?, role_id = ?, name = ?, code = ?, phone = ?, address = ?, birthday = ?, join_date = ?, email = ?, description = ?, is_pass = ?"
					+ "where id = ?";
			int result = jdbcTemplate.update(sql, new Object[]{employee.getDeptId(), employee.getSalaryId(), employee.getPositionId(), employee.getRoleId(), employee.getName(), employee.getCode(), employee.getPhone(), employee.getAddress(), employee.getBirthday(), employee.getJoinDate(), employee.getEmail(), employee.getDescription(), employee.isPass(), employee.getId()});
			return result == 1;
		} else {
			sql = "insert into "
					+ "employee(dept_id, salary_id, position_id, role_id, name, code, phone, address, birthday, join_date, email, description, is_pass)"
					+ "values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
			int result = jdbcTemplate.update(sql, new Object[]{employee.getDeptId(), employee.getSalaryId(), employee.getPositionId(), employee.getRoleId(), employee.getName(), employee.getCode(), employee.getPhone(), employee.getAddress(), employee.getBirthday(), employee.getJoinDate(), employee.getEmail(), employee.getDescription(), employee.isPass()});
			return result == 1;
		}
	}

	@Override
	public boolean delete(int id) {
		String sql = "delete from employee where id = ?";
		return jdbcTemplate.update(sql, id) == 1;
	}
}
