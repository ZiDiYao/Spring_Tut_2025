package com.zidi.spring_tut_2025.mySpringFrameworkSimulation.core;

public interface ApplicationContext {

    Object getBean(String beanName);

    // 根据 Bean 的名称获取 配置文件中的 Bean 对象 BeanId
}
