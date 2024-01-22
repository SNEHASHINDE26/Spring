package Demo;

public class Laptop implements Machine {

    @Override
    public void getType() {
        System.out.println("Machine Type is Laptop");
    }
    @Override
    public void getPrice(){
        System.out.println("Machine Cost is 75000");
    }
}
