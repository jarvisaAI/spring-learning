package com.dev.lazyfind;

import com.dev.lazyfind.bean.Cat;
import com.dev.lazyfind.bean.Dog;
import org.springframework.beans.factory.ObjectProvider;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Map;

// 第七节
public class App3 {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("basic_dl/quickstart-lazyfind.xml");
        Cat cat = ctx.getBean(Cat.class);
        System.out.println(cat);
        /*延迟查找 ObjectProvider相当于延后了Bean的获取时机*/
        ObjectProvider<Dog> beanProvider = ctx.getBeanProvider(Dog.class);
        // 调用getObject方法时会报异常
        // Dog object = beanProvider.getObject(Dog.class);
        // getIfAvailable() 找不到Bean 时返回null而不抛出异常
//        Dog dog = beanProvider.getIfAvailable();
//        if (dog==null){
//            dog = new Dog();
//        }
//        System.out.println(dog);
        Dog ifAvailable = beanProvider.getIfAvailable(() -> new Dog());
        System.out.println(ifAvailable);
    }
}
