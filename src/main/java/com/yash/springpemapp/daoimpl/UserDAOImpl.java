package com.yash.springpemapp.daoimpl;

import com.yash.springpemapp.dao.UserDAO;
import com.yash.springpemapp.domain.User;
import com.yash.springpemapp.rowmapper.UserRowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class UserDAOImpl extends BaseDAO implements UserDAO {

    public void save(User user) {
        String sql = "INSERT INTO users(name, phone, email, loginName, password) values (:name, :phone, :email, :loginName, :password)";
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("name", user.getName());
        map.put("phone", user.getPhone());
        map.put("email", user.getEmail());
        map.put("loginName", user.getLoginName());
        map.put("password", user.getPassword());

        KeyHolder kh = new GeneratedKeyHolder();
        SqlParameterSource ps = new MapSqlParameterSource(map);
        getNamedParameterJdbcTemplate().update(sql, ps, kh);
        Integer userId = kh.getKey().intValue();
        user.setId(userId);
    }

    public void update(User user) {
        String sql = "UPDATE users SET name=:name, phone=:phone, email=:email WHERE userId=:userId";
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("name", user.getName());
        map.put("phone", user.getPhone());
        map.put("email", user.getEmail());
        map.put("userId", user.getId());

        getNamedParameterJdbcTemplate().update(sql, map);
    }

    public void delete(User user) {

    }

    public void delete(int id) {

    }

    public User findById(int id) {
        String sql = "SELECT * FROM users WHERE userId = ?";
        User user = getJdbcTemplate().queryForObject(sql, new UserRowMapper(), id);
        return user;
    }

    public List<User> findAll() {
        String sql = "SELECT * FROM users";
        List<User> users = getJdbcTemplate().query(sql, new UserRowMapper());
        return users;
    }

    public List<User> findByProperty(String propertyName, Object propertyValue) {
        String sql = "SELECT * FROM users WHERE " + propertyName + " =?";
        List<User> users = getJdbcTemplate().query(sql, new UserRowMapper());
        return users;
    }
}
