package com.yash.springpemapp.dao;

import com.yash.springpemapp.domain.Expense;

import java.util.List;

public interface ExpenseDAO {

    void save(Expense expense);

    void update(Expense expense);

    void delete(Expense expense);

    void delete(int id);

    Expense findById(int id);

    List<Expense> findAll();

    List<Expense> findByProperty(String propertyName, Object propertyValue);

}
