package hv.com.app.model.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import hv.com.app.model.Dept;

import org.springframework.jdbc.core.RowMapper;

public class DeptMapper implements RowMapper<Dept> {

	@Override
	public Dept mapRow(ResultSet rs, int rowNum) throws SQLException {
		Dept dept = new Dept();
		dept.setId(rs.getInt("id"));
		dept.setName(rs.getString("name"));
		return dept;
	}
}
