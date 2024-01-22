package DemoCar;

public class PetrolCar implements Car {

    //HAS-A
    PetrolEngine engine;
    //constructor injection

    public PetrolCar(PetrolEngine engine){
        this.engine=engine;
    }

    @Override
    public void getType() {
        System.out.println("Car Type is Petrol Car");
    }
    @Override
    public void getEngineInfo(){
        engine.getType();
    }
}
