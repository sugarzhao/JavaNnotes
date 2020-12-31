package com.qinshufun.study.thread;

public class Main {
//    private static Logger logger = Logger.getLogger(Main.class);
    public static void main(String[] args) {
	// write your code here
        TestStatic testStatic = new TestStatic();
        RefreshThread refreshThread = new RefreshThread(testStatic);
        refreshThread.start();
        Thread thread1 = new TestStaticThread(testStatic);
        thread1.start();
        Thread thread2 = new TestStaticThread(testStatic);
        thread2.start();
        Thread thread3 = new TestStaticThread(testStatic);
        thread3.start();
        Thread thread4 = new TestStaticThread(testStatic);
        thread4.start();
        Thread thread5 = new TestStaticThread(testStatic);
        thread5.start();


    }




}
