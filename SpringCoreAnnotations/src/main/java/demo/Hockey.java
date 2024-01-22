package demo;

import org.springframework.stereotype.Component;

@Component("sport1")
public class Hockey implements Sport{

    @Override
    public void getName() {
        System.out.println("Sport Name is Hockey");
    }

    @Override
    public void getType() {
       System.out.println("Sport Type is Outdoor");
    }
}
