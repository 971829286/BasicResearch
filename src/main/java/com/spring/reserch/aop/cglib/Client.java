package com.spring.reserch.aop.cglib;

import net.sf.cglib.core.DebuggingClassWriter;
import net.sf.cglib.proxy.Callback;
import net.sf.cglib.proxy.Enhancer;

import java.util.ArrayList;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        // 代理类class文件存入本地磁盘方便我们反编译查看源码
        System.setProperty(DebuggingClassWriter.DEBUG_LOCATION_PROPERTY, "D:\\code");
        // 通过CGLIB动态代理获取代理对象的过程
        Enhancer enhancer = new Enhancer();
        // 设置enhancer对象的父类
        enhancer.setSuperclass(HelloService.class);

        // 设置enhancer的回调对象
        Callback[] a={new MyMethodInterceptor(),new MyMethodInterceptor2()};
        Class[] b = {HelloService.class,HelloService.class};
        enhancer.setCallbackTypes(b);
        enhancer.setCallbacks(a);
        // 创建代理对象
        HelloService proxy= (HelloService)enhancer.create();
        // 通过代理对象调用目标方法
        proxy.sayHello();
    }
}
