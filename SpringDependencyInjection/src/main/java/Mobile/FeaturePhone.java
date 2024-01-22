package Mobile;

public class FeaturePhone implements Mobile1 {

    private SimCard card;

    //setter injection


    public void setCard(SimCard card) {
        this.card = card;
    }

    @Override
    public void getType() {
        System.out.println("Mobile Type is Feture Phone");
    }

    @Override
    public void getSimInfo() {
        card.getCompany();


    }
}
