package com.qinshufun.study.collections;

import java.util.Objects;

public class TestObject implements Comparable<TestObject>{
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public TestObjectUnit getTu() {
        return tu;
    }

    public void setTu(TestObjectUnit tu) {
        this.tu = tu;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TestObject that = (TestObject) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(desc, that.desc) &&
                Objects.equals(tu, that.tu);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, desc, tu);
    }

    private Long id;
    private String desc;
    private TestObjectUnit tu;

    @Override
    public int compareTo(TestObject o) {
        return 1;
    }
}
