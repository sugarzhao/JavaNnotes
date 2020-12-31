package com.qinshufun.study.thread;

import org.apache.log4j.Logger;

public class RefreshThread extends Thread{
    private static Logger logger = Logger.getLogger(RefreshThread.class);
    private TestStatic testStatic;
    private int count;

    RefreshThread(TestStatic testStatic){
        this.testStatic=testStatic;
    }
    @Override
    public void run() {
        while (true){
            try {
                Thread.sleep(6000);
                testStatic.getHashMap().forEach((key, value)->{
                    synchronized (value){
                        if(value.getStatus()==1){
                            value.setStatus(2);
                            count++;
                        }
                    }
                });
                logger.info(String.format("count:%d",count));
            } catch (InterruptedException e) {
                throw new RuntimeException("sleep 6 seconds error",e);
            }
        }
    }
}
