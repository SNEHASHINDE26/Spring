package DemoLaptop;

public class HP implements Laptop {

    //setter injection
    private GraphicsCard card;

    public void setCard(GraphicsCard card){
        this.card=card;
    }
    @Override
    public void getType() {
        System.out.println("This is HP");
    }

    @Override
    public void getLaptopInfo() {

    }
}
