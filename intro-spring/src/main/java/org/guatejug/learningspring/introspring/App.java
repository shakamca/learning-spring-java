package org.guatejug.learningspring.introspring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Mario Batres
 * @version 1.0
 *
 */
public class App {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("resources/applicationContext.xml");

        User user1 = (User) context.getBean("user1");
        System.out.println(user1);

        User user2 = (User) context.getBean("user2");
        System.out.println(user2);
    }
}
