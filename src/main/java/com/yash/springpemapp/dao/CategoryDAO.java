package com.yash.springpemapp.dao;

import com.yash.springpemapp.domain.Category;

import java.util.List;

public interface CategoryDAO {

    void save(Category category);

    void update(Category category);

    void delete(Category category);

    void delete(int id);

    Category findById(int id);

    List<Category> findAll();

    List<Category> findByProperty(String propertyName, Object propertyValue);

}
