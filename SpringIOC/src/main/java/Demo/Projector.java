package Demo;


public class Projector implements Machine {

    @Override
    public void getType() {
       System.out.println("Machine Type is Projector");
    }

    @Override
    public void getPrice() {
        System.out.println("Machine Price is 25000");
    }
}
