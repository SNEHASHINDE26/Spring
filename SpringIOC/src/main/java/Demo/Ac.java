package Demo;

public class Ac implements Machine{

    @Override
    public void getType() {
        System.out.println("Machine Type is AC");
    }

    @Override
    public void getPrice() {
         System.out.println("Machine Price is 75000");
    }
}
