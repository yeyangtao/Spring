package com.yyt;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;

public class LoginAspect {
    public void before(){
        System.out.println("befor执行");
    }

    public Object around(ProceedingJoinPoint pjp) throws Throwable {
        System.out.println("around before");
        Object o = pjp.proceed();
        System.out.println("around after");
        return o;
    }

    public void after(JoinPoint joinPoint) throws Throwable {
        System.out.println("after执行");
    }

    public void returnmethod(Object obj) throws Throwable {
        System.out.println("返回值："+obj);
    }

    public void th(JoinPoint joinPoint) throws Throwable {
    }
}
