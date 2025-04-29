package com.zidi.spring_tut_2025;

import java.lang.reflect.Method;
import org.junit.jupiter.api.Test;

public class TestClass {

    @Test
    public void testReflection() throws ClassNotFoundException, NoSuchMethodException {
        Class<?> clazz = Class.forName("com.zidi.spring_tut_2025.bean.User");

        // 假设 User 类里有个无参数的 doSome 方法
        Method doSome = clazz.getDeclaredMethod("doSome");

        System.out.println("找到方法: " + doSome.getName());
    }
}
