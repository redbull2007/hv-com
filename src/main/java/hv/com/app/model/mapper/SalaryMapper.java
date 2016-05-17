package hv.com.app.model.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import hv.com.app.model.Salary;

import org.springframework.jdbc.core.RowMapper;

public class SalaryMapper implements RowMapper<Salary> {
	
	@Override
	public Salary mapRow(ResultSet rs, int rowNum) throws SQLException {
		Salary salary = new Salary();
		salary.setId(rs.getInt("id"));
		salary.setUserId(rs.getInt("employee_id"));
		salary.setProbationSalary(rs.getInt("probation_salary"));
		salary.setOfficialSalary(rs.getInt("official_salary"));
		salary.setUpdateBy(rs.getInt("update_by"));
		salary.setLastUpdateDate(rs.getString("last_update_date"));
		return salary;
	}
}
