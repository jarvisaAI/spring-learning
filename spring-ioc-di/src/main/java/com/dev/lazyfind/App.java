package com.dev.lazyfind;

import com.dev.lazyfind.bean.Cat;
import com.dev.lazyfind.bean.Dog;
import org.springframework.beans.factory.NoSuchBeanDefinitionException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("basic_dl/quickstart-lazyfind.xml");
        Cat cat = ctx.getBean(Cat.class);
        System.out.println(cat);

        // 1
        Dog dog;
        try{
            dog = ctx.getBean(Dog.class);
        }catch (NoSuchBeanDefinitionException e){
            // 为了保证在没有找到Bean的时候启用的缺省策略 手动在catch块中创建
            dog = new Dog();
        }
        System.out.println(dog);
    }
}
