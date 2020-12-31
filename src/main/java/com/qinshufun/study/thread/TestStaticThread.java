package com.qinshufun.study.thread;

import org.apache.log4j.Logger;

import java.util.HashMap;

public class TestStaticThread extends  Thread {

    private static Logger logger = Logger.getLogger(TestStaticThread.class);
    private TestStatic testStatic;
    private HashMap<Integer,Order> hashMap = new HashMap();
    private int setCount =0;

    TestStaticThread(TestStatic testStatic){
        this.testStatic=testStatic;
    }
    @Override
    public void run() {

        while(true){
            reset();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
               throw  new RuntimeException("sleep in remove thread error ", e);
            }
//            addBack();
        }
    }

    public void reset(){
        testStatic.getHashMap().forEach((key,value)->{
            synchronized (value){
                if(value.getStatus()==0){
                    value.setStatus(1);
                    setCount++;
                }
            }
        });
//        while (!testStatic.getHashMap().isEmpty()) {
//            Order remove = null;
//            try{
//                remove = (Order) testStatic.getHashMap().get(this.testStatic.getHashMap().size()-1);
//                synchronized (remove) {
//                    if(remove.getStatus()==0){
////                        testStatic.getHashMap().remove(remove.getId());
//                        remove.setStatus(1);
////                        hashMap.put(remove.getId(),remove);
////                        countRemove++;
//
//                    }
//                }
//            }catch (NullPointerException e){
//                logger.warn(" get the lock of the map,but it has been removed and set status ", e);
//            }
            logger.info(String.format("thread name %s, set count %s",this.getName(),setCount));
//    }
    }

    public void addBack(){
       this.hashMap.forEach((key,value)->{
           HashMap<Integer,Order> targetHashMap = this.testStatic.getHashMap();
           synchronized (targetHashMap){
               targetHashMap.put(key,value);
           }
       });
    }

}
