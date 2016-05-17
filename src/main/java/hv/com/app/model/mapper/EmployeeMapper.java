package hv.com.app.model.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import hv.com.app.model.Employee;

import org.springframework.jdbc.core.RowMapper;

public class EmployeeMapper implements RowMapper<Employee> {
	
	@Override
	public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
		Employee employee = new Employee();
		employee.setId(rs.getInt("id"));
		employee.setDeptId(rs.getInt("dept_id"));
		employee.setSalaryId(rs.getInt("salary_id"));
		employee.setPositionId(rs.getInt("position_id"));
		employee.setRoleId(rs.getInt("role_id"));
		employee.setName(rs.getString("name"));
		employee.setPhone(rs.getString("phone"));
		employee.setCode(rs.getString("code"));
		employee.setAddress(rs.getString("address"));
		employee.setBirthday(rs.getString("birthday"));
		employee.setJoinDate(rs.getString("join_date"));
		employee.setEmail(rs.getString("email"));
		employee.setDescription(rs.getString("description"));
		employee.setPass(rs.getBoolean("is_pass"));
		return employee;
	}
}
