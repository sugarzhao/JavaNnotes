package com.qinshufun.study.collections;

import java.util.Objects;

public class TestObjectUnit {
    private int sortType;
    private String desc;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TestObjectUnit that = (TestObjectUnit) o;
        return sortType == that.sortType &&
                Objects.equals(desc, that.desc);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sortType, desc);
    }

    public int getSortType() {
        return sortType;
    }

    public void setSortType(int sortType) {
        this.sortType = sortType;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
