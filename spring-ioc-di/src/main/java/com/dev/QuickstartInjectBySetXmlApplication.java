package com.dev;

import com.dev.basic_di.Cat;
import com.dev.basic_di.Person;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class QuickstartInjectBySetXmlApplication {
    public static void main(String[] args) {
        BeanFactory factory = new ClassPathXmlApplicationContext("basic_di/inject-set.xml");
        Person person = factory.getBean(Person.class);
        System.out.println(person);

        Cat cat = factory.getBean(Cat.class);
        System.out.println(cat);
    }
}
