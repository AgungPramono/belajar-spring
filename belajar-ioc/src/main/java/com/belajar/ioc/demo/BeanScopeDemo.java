package com.belajar.ioc.demo;

import com.belajar.ioc.config.BeanScopeConfig;
import com.belajar.ioc.model.Member;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemo{
    public static void main(String[]args){
        // ApplicationContext context = 
                    // new ClassPathXmlApplicationContext("classpath:bean-scope-spring.xml");
        ApplicationContext context = 
                    new AnnotationConfigApplicationContext(BeanScopeConfig.class);


        Member newMember = context.getBean(Member.class);
        Member oldMember = context.getBean(Member.class);

        Boolean same = (newMember == oldMember);

        System.out.println("same member "+same);
        System.out.println("new member used memory "+newMember);
        System.out.println("old member used memory "+oldMember);
    }
}