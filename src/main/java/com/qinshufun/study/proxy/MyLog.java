package com.qinshufun.study.proxy;

public interface MyLog {
    default public void infor(){
        System.out.println("hello");
    };

    public  void sayGoodBye();
}
