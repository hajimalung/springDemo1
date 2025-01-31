package com.hajimalung;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");

        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");

        Alien obj = (Alien) context.getBean("alien");
        obj.name = "Hajimalung";

        // Alien obj2 = (Alien) context.getBean("alien");
        // obj2.name = "Daanish";

        obj.code();
        // obj2.code();
    }
}
