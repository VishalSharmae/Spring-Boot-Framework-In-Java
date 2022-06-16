package com.spring.constructorinjest;

public class Certificate {

     String name;

    public Certificate(String name) {
        this.name = name;
    }


    @Override
    public String toString() {
        return "Certificate{" +
                "name='" + name + '\'' +
                '}';
    }
}
