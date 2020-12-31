package com.qinshufun.study.thread;

import java.util.HashMap;

public class TestStatic {

    public HashMap<Integer,Order> getHashMap() {
        return hashMap;
    }

    public void setHashMap(HashMap hashMap) {
        this.hashMap = hashMap;
    }

    private HashMap<Integer,Order> hashMap= new HashMap();

    TestStatic(){
       for(int i=0; i<1000000; i++){
           Order order = new Order();
           order.setId(i);
           order.setDescription("ordered");
           order.setStatus(0);
           hashMap.put(order.getId(),order);
       }
    }
}
