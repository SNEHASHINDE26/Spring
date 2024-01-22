package Mobile;


import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
    public static void main(String[]args){

        ClassPathXmlApplicationContext c1=new ClassPathXmlApplicationContext("applicationContext.xml");
        Mobile1 m1=c1.getBean("mobile1", Mobile1.class );
        m1.getType();
        m1.getSimInfo();
        System.out.println("==========================");

        Mobile1 m2=c1.getBean("mobile2", Mobile1.class);
        m2.getType();
        m2.getSimInfo();
    }
}
