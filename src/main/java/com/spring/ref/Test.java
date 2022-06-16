package com.spring.ref;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("Refconfig.xml");

        A temp = (A) context.getBean("aref");

        System.out.println("X = " + temp.getX());
        System.out.println("Y = " + temp.getObj().getY());

    }
}
