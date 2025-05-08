package com.zidi.spring_tut_2025.mySpringFrameworkSimulation.core;

import java.util.HashMap;
import java.util.Map;

public class ClassPathXmlApplicationContext implements ApplicationContext{

    private Map<String,Object> singletonObjects = new HashMap<>();

    public ClassPathXmlApplicationContext(String configLocation){
        // 解析 XML 文件
        // 实例化  Bean 然后将 Bean 存放到 singletonObjects 集合中

    }

    @Override
    public Object getBean(String beanName){
        return null;
    }
}
