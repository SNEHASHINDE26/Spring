package demo;

import org.springframework.stereotype.Component;

@Component("sport2")
public class Chess implements Sport{

    @Override
    public void getName() {

        System.out.println("Sport Name is Chess");
    }

    @Override
    public void getType() {
        System.out.println("Sport Type is Indoor");

    }
}
