package Exercise17;

public class Television extends Appliance {
    private Integer resolution =20;
    private Boolean DTTtuner = false;

    public Television() {
    }

    public Television(Double priceBase, Integer weight) {
        super(priceBase, weight);
    }

    public Television(Double priceBase, String color, char energyConsumption, Integer weight, Integer resolution, Boolean DTTtuner) {
        super(priceBase, color, energyConsumption, weight);
        this.resolution = resolution;
        this.DTTtuner = DTTtuner;
    }

    public Integer getResolution() {
        return resolution;
    }

    public Boolean getDTTtuner() {
        return DTTtuner;
    }

    @Override
    public double finalPrice() {
        Double price = super.finalPrice();
        if (resolution > 40) {
            price = price * 0.3 + price;
        }
        if(DTTtuner == true) {
            price += 50;
        }
        return price;
    }
}
