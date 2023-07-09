package com.khadri.spring.core;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;


public class Main {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        Student student = context.getBean(Student.class);
        System.out.println(student.getName());
        System.out.println(student.getPrettyName());
        System.out.println(student.getDynamicName());
        System.out.println(student.getUnknownName());

        System.out.println("ALl Names");
        Arrays.stream(student.getAllNames()).forEach(System.out::println);

        System.out.println(student.getListNames());
        System.out.println(student.getSubjectMarks());


    }
}