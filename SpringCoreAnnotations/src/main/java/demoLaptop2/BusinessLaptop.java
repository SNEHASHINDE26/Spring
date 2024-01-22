package demoLaptop2;

import org.springframework.stereotype.Component;

@Component("laptop2")
public class BusinessLaptop implements Laptop{

    Processor pro=null;
    //constructor injection


    public BusinessLaptop(Processor pro) {
        this.pro = pro;
    }

    @Override
    public void getType() {
        System.out.println("Laptop Type is Business");
    }

    @Override
    public void getProcessorInfo() {
        pro.getName();
    }
}
