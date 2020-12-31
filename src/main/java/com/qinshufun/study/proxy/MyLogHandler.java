package com.qinshufun.study.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class MyLogHandler implements InvocationHandler {
    private Object target;//目标类

    public MyLogHandler(Object target) {
        this.target = target;
    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        //
        System.out.println("aaaaa");//切面方法a();
        //。。。
        method.invoke(this.target, args);//调用目标类的目标方法
        //。。。
        System.out.println("bbbbb");//切面方法f();
        return null;
    }
}
