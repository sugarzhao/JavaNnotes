package com.qinshufun.study.collections;

import java.util.Comparator;

public class TestObjectComparator implements Comparator<TestObject> {

    @Override
    public int compare(TestObject o1, TestObject o2) {
        return o1.getId().equals(o2.getId())? 0:o1.compareTo(o2);
    }
}
