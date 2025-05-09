package com.zidi.spring_tut_2025;

import org.aspectj.lang.ProceedingJoinPoint;

public class TimerAspect {

    // 通知

    public void aroundAdvice(ProceedingJoinPoint joinPoint) throws Throwable {
        long begin = System.currentTimeMillis();
        joinPoint.proceed();

        long end = System.currentTimeMillis();

        System.out.println(end-begin + "s");
    }
}
