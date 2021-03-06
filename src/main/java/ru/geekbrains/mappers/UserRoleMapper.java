package ru.geekbrains.mappers;

import org.springframework.jdbc.core.RowMapper;
import ru.geekbrains.entities.Role;

import java.sql.ResultSet;
import java.sql.SQLException;

//@Component
public class UserRoleMapper implements RowMapper<Role> {
    @Override
    public Role mapRow(ResultSet rs, int rowNum) throws SQLException {
        Role role = new Role();
        role.setId(rs.getLong("id"));
        role.setName(rs.getString("name"));
        return role;
    }
}
