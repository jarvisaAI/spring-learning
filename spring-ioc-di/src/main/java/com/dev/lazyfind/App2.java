package com.dev.lazyfind;

import com.dev.lazyfind.bean.Cat;
import com.dev.lazyfind.bean.Dog;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App2 {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("basic_dl/quickstart-lazyfind.xml");
        Cat cat = ctx.getBean(Cat.class);
        System.out.println(cat);
        // 2 改良-获取之前先检查 ApplicationContext中有一个方法专门检查是否有指定的Bean存在
        // containBean()
        Dog dog = ctx.containsBean("dog")?(Dog)ctx.getBean("dog"):new Dog();

        System.out.println(dog);
    }
}
