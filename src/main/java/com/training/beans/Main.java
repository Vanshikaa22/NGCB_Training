package com.training.beans;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext applicationContext =
                new ClassPathXmlApplicationContext(
                        "beanconfig.xml");
        Object employeeSetterInjectionBeanObj = applicationContext.getBean("setterInjectionBean");
        System.out.println(employeeSetterInjectionBeanObj);
        Object employeeConstructorInjectionBeanObj = applicationContext.getBean("employeeConstructorInjectionBeanObj");
        System.out.println(employeeConstructorInjectionBeanObj);
        ManagerBeans beanInjection = (ManagerBeans)applicationContext.getBean("beanInjection");
        System.out.println(beanInjection);
        Question beanList = (Question)applicationContext.getBean("question");
        System.out.println(beanList);
        Shop beanSet = (Shop)applicationContext.getBean("shop");
        System.out.println(beanSet);
        AddressBook beanMap = (AddressBook)applicationContext.getBean("addressBook");
        System.out.println(beanMap);
    }
}
