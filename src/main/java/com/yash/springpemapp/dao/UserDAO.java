package com.yash.springpemapp.dao;

import com.yash.springpemapp.domain.User;

import java.util.List;

public interface UserDAO {
    void save(User user);

    void update(User user);

    void delete(User user);

    void delete(int id);

    User findById(int id);

    List<User> findAll();

    List<User> findByProperty(String propertyName, Object propertyValue);
}
