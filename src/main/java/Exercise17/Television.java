package Exercise17;

/**
 * Contiene los atributos y métodos correspondientes a la clase televisor
 *
 * @author Lorena Castro <Lcastro0398@gmail.com>
 * @version 1.0.0
 * @since 1.0.0
 */
public class Television extends Appliance {
    private Integer resolution = 20;
    private Boolean DTTtuner = false;

    /**
     * Constructor por defecto
     */
    public Television() {
    }

    /**
     * Constructor con los atributos precio base y peso
     *
     * @param priceBase
     * @param weight
     */
    public Television(Double priceBase, Integer weight) {
        super(priceBase, weight);
    }

    /**
     * Constructor con todos los atributos
     *
     * @param priceBase
     * @param color
     * @param energyConsumption
     * @param weight
     * @param resolution
     * @param DTTtuner
     */
    public Television(Double priceBase, String color, char energyConsumption, Integer weight, Integer resolution, Boolean DTTtuner) {
        super(priceBase, color, energyConsumption, weight);
        this.resolution = resolution;
        this.DTTtuner = DTTtuner;
    }

    /**
     * Mértodo accesor de resolución
     *
     * @return
     */
    public Integer getResolution() {
        return resolution;
    }

    /**
     * Método accesor de sintonizador TDT
     *
     * @return
     */
    public Boolean getDTTtuner() {
        return DTTtuner;
    }

    /**
     * Se socreescribe el precio final para modificarlo dependiendo de la carga de este tipo de electrodoméstico
     *
     * @return
     * @author Lorena Castro <Lcastro0398@gmail.com>
     * @since 1.0.0
     */
    @Override
    public double finalPrice() {
        Double price = super.finalPrice();
        if (resolution > 40) {
            price = price * 0.3 + price;
        }
        if (DTTtuner == true) {
            price += 50;
        }
        return price;
    }
}
