package com.yash.springpemapp.service;

import com.yash.springpemapp.domain.User;
import com.yash.springpemapp.exception.BlockUserException;

import java.util.List;

public interface UserService {

    int LOGIN_STATUS_ACTIVE = 1;
    int LOGIN_STATUS_BLOCKED = 2;
    int ROLE_ADMIN = 1;
    int ROLE_USER = 2;

    void register(User user);
    User login(String loginName, String password) throws BlockUserException;
    List<User> getUserList();
    void changeLoginStatus(int id, Integer loginStatus);
}
