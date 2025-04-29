package com.zidi.spring_tut_2025;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Test2 {
    // 用来模拟 spring 通过 反射机制 Reflatioon
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InstantiationException, IllegalAccessException, InvocationTargetException {

        String className = "com.zidi.relfect.User";
        String PropertyName = "age";

        Class<?>  clazz = Class.forName(className);

        String setMethodNmae = "set"+ PropertyName.toUpperCase().charAt(0) + PropertyName.substring(1);

        Method setMethod = clazz.getDeclaredMethod(setMethodNmae,int.class);

        Object obj = clazz.newInstance();

        setMethod.invoke(obj,30);

        System.out.println(obj);
    }
}
