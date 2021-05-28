package com.dev;

import com.dev.basic_dl.bean.Person;
import com.dev.basic_dl.dao.DemoDao;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppByType {
    public static void main(String[] args) {
        BeanFactory factory = new ClassPathXmlApplicationContext("basic_dl/quickstart-bytype.xml");
        Person bean = factory.getBean(Person.class);
        System.out.println(bean);

        DemoDao demoDao = factory.getBean(DemoDao.class);
        System.out.println(demoDao.findAll());
    }
}
