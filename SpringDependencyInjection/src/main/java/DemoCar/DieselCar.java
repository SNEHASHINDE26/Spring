package DemoCar;

public class DieselCar implements Car {

    //HAS-A
    DieselEngine engine;
    //constructor injection

    public DieselCar(DieselEngine engine){
        this.engine=engine;
    }

    @Override
    public void getType() {
        System.out.println("Car Type is Diesel Car");
    }
    @Override
    public void getEngineInfo(){
        engine.getType();
    }

}
