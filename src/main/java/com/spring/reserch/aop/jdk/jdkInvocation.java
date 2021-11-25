package com.spring.reserch.aop.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class jdkInvocation implements InvocationHandler {
    private Object object;

    public void setTagServiceObject(Object object) {
        this.object = object;
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("TagService代理前");
        Object returnObject = method.invoke(this.object, args);
        System.out.println("TagService代理后");
        return returnObject;
    }
}