package demoLaptop2;

import demoLaptop2.Processor;
import org.springframework.stereotype.Component;

@Component
public class Intel implements Processor {


    @Override
    public void getName() {
      System.out.println("Processor Name is Intel");
    }
}
