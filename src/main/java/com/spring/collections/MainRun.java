package com.spring.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainRun {

    public static void main(String[] args) {

        ApplicationContext context =  new ClassPathXmlApplicationContext("CollectionConfig.xml");

        Employees employee1 = (Employees) context.getBean("employee1");

        System.out.println(employee1.getName());
        System.out.println(employee1.getPhones());
        System.out.println(employee1.getAddress());
        System.out.println(employee1.getCourse());
        System.out.println(employee1.getProperties());

        System.out.println(employee1);

    }
}
