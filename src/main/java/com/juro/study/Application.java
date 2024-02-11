package com.juro.study;

import com.juro.study.config.AppConfig;
import com.juro.study.server.Controller;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {

    public static void main(String[] args){
        System.out.println("Hello, Spring Framework study");

        String configFileName = "applicationContext.xml";

        ApplicationContext context = new ClassPathXmlApplicationContext(configFileName);

        Controller controller = (Controller) context.getBean(Controller.class);

        System.out.println(controller.getConfig().getObservedDay());
        System.out.println(controller.getConfig().getTargetAssetType());

    }
}
