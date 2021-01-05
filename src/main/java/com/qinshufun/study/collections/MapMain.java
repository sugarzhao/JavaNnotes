package com.qinshufun.study.collections;

import org.apache.log4j.Logger;

import java.util.TreeSet;

/**
 * 这个类是测试hashSet 的equal 方法，以及HashSet 的特性
 */
public class MapMain {
    private static Logger logger = Logger.getLogger(MapMain.class);
    public static void main(String[] args) {

        TestObjectUnit tu1= new TestObjectUnit();
        tu1.setSortType(1);
        tu1.setDesc("good one");
        TestObject to1 = new TestObject();
        to1.setId(new Long(1));
        to1.setDesc("good one out");
        to1.setTu(tu1);
        TestObjectUnit tu2= new TestObjectUnit();
        tu2.setSortType(1);
        tu2.setDesc("good one");
        TestObject to2 = new TestObject();
        to2.setId(new Long(1));
        to2.setDesc("good one out");
        to2.setTu(tu2);
        // HashSet
//        HashSet hashSet = new HashSet();
//        hashSet.add(to1);
//        hashSet.add(to2);
//        logger.info(String.format("the size is %s",hashSet.size()));
        // LinkedHashSet
//        LinkedHashSet linkedHashSet = new LinkedHashSet();
//        linkedHashSet.add(to1);
//        linkedHashSet.add(to2);
//        logger.info(String.format("the size is %s",linkedHashSet.size()));
        // TreeSet
//        TreeSet treeSet = new TreeSet();
//        treeSet.add(to1);
//        treeSet.add(to2);
//        logger.info(String.format("the size is %s",treeSet.size()));

        TreeSet<TestObject> ts = new TreeSet<>(new TestObjectComparator());
        ts.add(to1);
        ts.add(to2);
        logger.info(String.format("the size is %s",ts.size()));
    }
}
