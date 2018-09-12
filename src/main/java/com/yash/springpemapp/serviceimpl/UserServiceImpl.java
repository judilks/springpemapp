package com.yash.springpemapp.serviceimpl;

import com.yash.springpemapp.dao.UserDAO;
import com.yash.springpemapp.domain.User;
import com.yash.springpemapp.exception.BlockUserException;
import com.yash.springpemapp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.w3c.dom.UserDataHandler;

import java.util.List;
@Service
public class UserServiceImpl implements UserService {


    @Autowired
    UserDAO userDAO;

    public void register(User user) {
        userDAO.save(user);
    }

    public User login(String loginName, String password) throws BlockUserException {
        return null;
    }

    public List<User> getUserList() {
        return userDAO.findAll();
    }

    public void changeLoginStatus(int id, Integer loginStatus) {

    }
}
