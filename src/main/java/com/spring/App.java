package com.spring;

import org.springframework.beans.factory.BeanDefinitionStoreException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class App {

    public static void main(String[] args) {

        System.out.println("Spring Project Started");
        try {
            ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");

            Student student1 = (Student) context.getBean("student1");
            Student student2 = (Student) context.getBean("student2");
            Student student3 = (Student) context.getBean("student3");
            System.out.println(student1);
            System.out.println(student2);
            System.out.println(student3);

        }catch (BeanDefinitionStoreException e){
            System.out.println(e);
        }
    }
}
