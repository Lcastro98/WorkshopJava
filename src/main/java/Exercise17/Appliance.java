package Exercise17;

public abstract class Appliance {
    private Double priceBase = 100D;
    private String color = "blanco";
    private char energyConsumption = 'F';
    private Integer weight = 5;

    public Appliance() {
    }

    public Appliance(Double priceBase, Integer weight) {
        this.priceBase = priceBase;
        this.weight = weight;
    }

    public Appliance(Double priceBase, String color, char energyConsumption, Integer weight) {
        this.priceBase = priceBase;
        this.color = color;
        this.energyConsumption = energyConsumption;
        this.weight = weight;
    }

    public Double getPriceBase() {
        return priceBase;
    }

    public String getColor() {
        return color;
    }

    public char getEnergyConsumption() {
        return energyConsumption;
    }

    public Integer getWeight() {
        return weight;
    }

    public void checkEnergyConsumption(char letter){
        char[] letters = {'A', 'B', 'C', 'D','E', 'F'};
        for (int i = 0; i < letters.length; i++) {
            if(letters[i] != letter) {
                letter = 'F';
            }
        }
    }

    public void checkColor(String color) {
        if (color != "blanco" || color != "negro" || color != "rojo" ||
                color != "azul" || color != "gris"){
            this.color = "blanco";
        }
    }


    public double finalPrice(){
        Double increaseByEnergy = 0D;
        Double increaseByWeight = 0D;

        switch (this.energyConsumption){
            case 'A' -> increaseByEnergy = 100D;
            case 'B' -> increaseByEnergy = 80D;
            case 'C' -> increaseByEnergy = 60D;
            case 'D' -> increaseByEnergy = 50D;
            case 'E' -> increaseByEnergy = 30D;
            case 'F' -> increaseByEnergy = 10D;
        }

        if(this.weight >= 0 && this.weight <= 19){
            increaseByWeight = 10D;
        } else if (this.weight >= 20 && this.weight <= 49){
            increaseByWeight = 50D;
        } else if (this.weight >= 50 && this.weight <= 79){
            increaseByWeight = 80D;
        } else {
            increaseByWeight = 100D;
        }

        Double price = this.priceBase + increaseByEnergy + increaseByWeight;
        return price;
    }
}
