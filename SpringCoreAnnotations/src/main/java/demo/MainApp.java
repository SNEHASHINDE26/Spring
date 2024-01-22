package demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
    public static void main(String[]args){
        ClassPathXmlApplicationContext c1=new ClassPathXmlApplicationContext("applicationContext.Xml");

        Sport s1=c1.getBean("sport1", Sport.class);
        s1.getName();
        s1.getType();

        Sport s2=c1.getBean("sport2", Sport.class);
        s2.getName();
        s2.getType();


    }
}
