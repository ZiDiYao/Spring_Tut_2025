package com.zidi.spring_tut_2025.service.impl;

import com.zidi.spring_tut_2025.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {

    private final UserDao userDao;

//     这种写法在有多个构造器的时候特别有用，可以告诉 Spring： 用这个构造器来注入"。

    @Autowired
    public CustomerService(UserDao userDao) {
        this.userDao = userDao;
    }

    public void save(){

    }
}
