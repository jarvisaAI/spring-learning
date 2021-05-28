package com.dev.basic_dl.ofType;

import com.dev.basic_dl.ofType.dao.DemoDao;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Map;

public class App {
    public static void main(String[] args) {
        ApplicationContext factory = new ClassPathXmlApplicationContext("basic_dl/quickstart-byname.xml");
        Map<String, DemoDao> beansOfType = factory.getBeansOfType(DemoDao.class);
        beansOfType.forEach((beanName,bean)->{
            System.out.println(beanName+ " : "+ bean.toString());
        });
    }
}
