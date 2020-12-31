package com.qinshufun.study.proxy;

import java.lang.reflect.Proxy;

public class ProxyMain {
    public static void main(String[] args) {
        MyLogImpl myLogImpl = new MyLogImpl();
        MyLogHandler myLogHandler = new MyLogHandler(myLogImpl);
        /*
         *  Proxy.newProxyInstance参数：
         * 	1、目标类的类加载器
         * 	2、目标类的所有的接口
         *  3、拦截器
         */
        //代理对象，调用系统方法自动生成
        MyLog proxyObj = (MyLog) Proxy.newProxyInstance(myLogImpl.getClass().getClassLoader(), myLogImpl.getClass().getInterfaces(), myLogHandler);
        proxyObj.sayGoodBye();

    }
}
