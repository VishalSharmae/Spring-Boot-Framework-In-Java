package com.spring.ref;

public class A {
    private int x;
    private B obj;


    public A(int x, B obj) {
        this.x = x;
        this.obj = obj;
    }

    public int getX() {
        return x;
    }

    @Override
    public String toString() {
        return "A{" +
                "x=" + x +
                ", obj=" + obj +
                '}';
    }

    public void setX(int x) {
        this.x = x;
    }

    public A() {
        super();
    }

    public B getObj() {
        return obj;
    }

    public void setObj(B obj) {
        this.obj = obj;
    }
}
