package com.yash.springpemapp.rowmapper;

import com.yash.springpemapp.domain.User;
import org.springframework.jdbc.core.RowMapper;

import javax.swing.tree.TreePath;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserRowMapper implements RowMapper<User> {


    public User mapRow(ResultSet rs, int rowNo) throws SQLException{
        User user = new User();
        user.setId(rs.getInt("id"));
        user.setName(rs.getString("name"));
        user.setPhone(rs.getString("phone"));
        user.setEmail(rs.getString("email"));
        user.setLoginName(rs.getString("loginName"));
        user.setPassword(rs.getString("password"));
        user.setRole(rs.getInt("role"));
        user.setStatus(rs.getInt("status"));
        return user;
    }

}
