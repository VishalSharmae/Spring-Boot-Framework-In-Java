package com.spring.constructorinjest;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Run {

    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("ConstructorConfig.xml");

        Person person = (Person) context.getBean("person");
        Person person1 = (Person) context.getBean("person1");
        Person person2 = (Person) context.getBean("person2");

        System.out.println(person);
        System.out.println(person1);
        System.out.println(person2);
    }
}
