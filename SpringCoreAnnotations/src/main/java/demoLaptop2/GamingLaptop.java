package demoLaptop2;

import org.springframework.stereotype.Component;

@Component("laptop1")
public class GamingLaptop implements Laptop{

    Processor pro=null;
    //Constructor injection


    public GamingLaptop(Processor pro) {
        this.pro = pro;
    }

    @Override
    public void getType() {
      System.out.println("Laptop Type is Gaming");
    }

    @Override
    public void getProcessorInfo() {
         pro.getName();

    }
}
