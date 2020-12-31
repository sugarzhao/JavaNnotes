package com.qinshufun.study.proxy;

public class MyLogImpl implements MyLog{
    public void infor(){
        System.out.println("Impl log");
    }
    public void sayGoodBye(){
        System.out.println("say good bye");
    }
}
