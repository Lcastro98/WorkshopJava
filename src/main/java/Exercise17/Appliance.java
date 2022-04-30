package Exercise17;

/**
 * Clase abstracta Electrodoméstico
 *
 * @author Lorena Castro <Lcastro0398@gmail.com>
 * @version 1.0.0
 * @since 1.0.0
 */
public abstract class Appliance {
    private Double priceBase = 100D;
    private String color = "blanco";
    private char energyConsumption = 'F';
    private Integer weight = 5;

    /**
     * Constructor por defecto
     *
     * @author Lorena Castro <Lcastro0398@gmail.com>
     * @since 1.0.0
     */
    public Appliance() {
    }

    /**
     * Constructor con los atributos precio base y peso
     *
     * @param priceBase
     * @param weight
     * @author Lorena Castro <Lcastro0398@gmail.com>
     * @since 1.0.0
     */
    public Appliance(Double priceBase, Integer weight) {
        this.priceBase = priceBase;
        this.weight = weight;
    }

    /**
     * Constructor con todos los atributos
     *
     * @param priceBase
     * @param color
     * @param energyConsumption
     * @param weight
     * @author Lorena Castro <Lcastro0398@gmail.com>
     * @since 1.0.0
     */
    public Appliance(Double priceBase, String color, char energyConsumption, Integer weight) {
        this.priceBase = priceBase;
        this.color = color;
        this.energyConsumption = energyConsumption;
        this.weight = weight;
    }

    /**
     * Método accesor de precio base
     *
     * @return
     */
    public Double getPriceBase() {
        return priceBase;
    }

    /**
     * Método accesor de color
     *
     * @return
     */
    public String getColor() {
        return color;
    }

    /**
     * Método accesor de consumo energético
     *
     * @return
     */
    public char getEnergyConsumption() {
        return energyConsumption;
    }

    /**
     * Método accesor de peso
     *
     * @return
     */
    public Integer getWeight() {
        return weight;
    }

    /**
     * Validar el consumo energético
     *
     * @param letter
     */
    public void checkEnergyConsumption(char letter) {
        char[] letters = {'A', 'B', 'C', 'D', 'E', 'F'};
        for (int i = 0; i < letters.length; i++) {
            if (letters[i] != letter) {
                letter = 'F';
            }
        }
    }

    /**
     * validar color
     *
     * @param color
     */
    public void checkColor(String color) {
        if (color != "blanco" || color != "negro" || color != "rojo" ||
                color != "azul" || color != "gris") {
            this.color = "blanco";
        }
    }

    /**
     * Calcula el precio final
     *
     * @return
     */
    public double finalPrice() {
        Double increaseByEnergy = 0D;
        Double increaseByWeight = 0D;

        switch (this.energyConsumption) {
            case 'A' -> increaseByEnergy = 100D;
            case 'B' -> increaseByEnergy = 80D;
            case 'C' -> increaseByEnergy = 60D;
            case 'D' -> increaseByEnergy = 50D;
            case 'E' -> increaseByEnergy = 30D;
            case 'F' -> increaseByEnergy = 10D;
        }

        if (this.weight >= 0 && this.weight <= 19) {
            increaseByWeight = 10D;
        } else if (this.weight >= 20 && this.weight <= 49) {
            increaseByWeight = 50D;
        } else if (this.weight >= 50 && this.weight <= 79) {
            increaseByWeight = 80D;
        } else {
            increaseByWeight = 100D;
        }

        Double price = this.priceBase + increaseByEnergy + increaseByWeight;
        return price;
    }
}
