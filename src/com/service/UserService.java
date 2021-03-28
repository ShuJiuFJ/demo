package com.service;

import com.bean.User;
import com.dao.UserDao;

import java.util.List;

public class UserService {
    public List<User> queryUserList(String name,String sex,String birthday){
        UserDao userDao = new UserDao();
        return userDao.queryUserList(name,sex,birthday);

    }
}
