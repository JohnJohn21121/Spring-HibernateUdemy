package com.JohnJohn21121;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {

    public static void main(String[] args) {


        //read the spring config file

        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");


        //get bean from spring container

        Coach theCoach = context.getBean("thatSillyCoach", Coach.class);
        Coach boxCoach = context.getBean("boxingCoach", Coach.class);
        Coach kCoach = context.getBean("karateCoach", Coach.class);

        //call method on a bean

        System.out.println(theCoach.getDailyWorkOut());
        System.out.println("Boxing Coach says : " + boxCoach.getDailyWorkOut());
        System.out.println("Karate Coach says : " + kCoach.getDailyWorkOut());

    //close context

        context.close();
    }
}