package hv.com.app.model.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import hv.com.app.model.Position;

import org.springframework.jdbc.core.RowMapper;

public class PositionMapper implements RowMapper<Position> {

	@Override
	public Position mapRow(ResultSet rs, int rowNum) throws SQLException {
		Position position = new Position();
		position.setId(rs.getInt("id"));
		position.setName(rs.getString("name"));
		return position;
	}
}
