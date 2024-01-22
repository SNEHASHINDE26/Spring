package BeanScope;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MeanApp2 {
    public static void main(String[]args){

        ClassPathXmlApplicationContext t1=new ClassPathXmlApplicationContext("applicationContext.xml");
        BeanLifeCycleDemo d1=t1.getBean("b1",BeanLifeCycleDemo.class);
                d1.display();
                t1.close();
    }
}
