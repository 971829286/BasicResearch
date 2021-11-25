package com.spring.reserch.aop.jdk;

import java.lang.reflect.Proxy;

public class start {
    public static void main(String[] args) {
        jdkInvocation invocation = new jdkInvocation();
        invocation.setTagServiceObject(new tagServiceImpl());

        tagService service = (tagService) Proxy.newProxyInstance(start.class.getClassLoader(), new Class[]{tagService.class}, invocation);
        service.printSomeThing();
        tagService1 service1 = (tagService1) Proxy.newProxyInstance(start.class.getClassLoader(), new Class[]{tagService1.class}, invocation);
        service1.printSomeThing();
    }
}