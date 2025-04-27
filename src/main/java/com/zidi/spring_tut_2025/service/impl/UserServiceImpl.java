package com.zidi.spring_tut_2025.service.impl;

import com.zidi.spring_tut_2025.dao.UserDao;
import com.zidi.spring_tut_2025.service.UserService;

public class UserServiceImpl implements UserService {

    private UserDao userDao;


    @Override
    public void deleteUser(){
        userDao.deleteById();
    }


}
