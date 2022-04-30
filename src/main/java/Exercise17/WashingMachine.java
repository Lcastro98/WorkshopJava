package Exercise17;

public class WashingMachine extends Appliance {
    private final Integer charge = 5;

    public WashingMachine() {
    }

    public WashingMachine(Double priceBase, Integer weight) {
        super(priceBase, weight);
    }

    public WashingMachine(Double priceBase, String color, char energyConsumption, Integer weight, Integer charge) {
        super(priceBase, color, energyConsumption, weight);
    }

    public Integer getCharge() {
        return charge;
    }

    @Override
    public double finalPrice() {
        Double price = super.finalPrice();
        if (charge > 30) {
            price += 50;
        }
        return price;
    }
}
