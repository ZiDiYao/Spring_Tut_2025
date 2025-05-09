package com.zidi.spring_tut_2025.service.impl;

import com.zidi.spring_tut_2025.dao.UserDao;
import com.zidi.spring_tut_2025.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    public void logout(){
        System.out.println("系统正在安全退出");
    }




}
