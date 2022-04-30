package Exercise17;

/**
 * Contiene los atributos y métodos de la clase Lavadora
 *
 * @author Lorena Castro <Lcastro0398@gmail.com>
 * @version 1.0.0
 * @since 1.0.0
 */
public class WashingMachine extends Appliance {
    private final Integer charge = 5;

    /**
     * Constructor por defecto
     *
     * @author Lorena Castro <Lcastro0398@gmail.com>
     * @since 1.0.0
     */
    public WashingMachine() {
    }

    /**
     * Constructor con los atributos precio base y peso
     *
     * @param priceBase
     * @param weight
     * @author Lorena Castro <Lcastro0398@gmail.com>
     * @since 1.0.0
     */
    public WashingMachine(Double priceBase, Integer weight) {
        super(priceBase, weight);
    }

    /**
     * Constructor con todos los atributos
     *
     * @param priceBase
     * @param color
     * @param energyConsumption
     * @param weight
     * @param charge
     * @author Lorena Castro <Lcastro0398@gmail.com>
     * @since 1.0.0
     */
    public WashingMachine(Double priceBase, String color, char energyConsumption, Integer weight, Integer charge) {
        super(priceBase, color, energyConsumption, weight);
    }

    /**
     * Método accesor de carga
     *
     * @return
     */
    public Integer getCharge() {
        return charge;
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
        if (charge > 30) {
            price += 50;
        }
        return price;
    }
}
