package Exercise4;

public class IVA {
    private static final Float percentage = 0.21F;
    private Float priceProduct;

    public IVA(Float priceProduct) {
        this.priceProduct = priceProduct;
    }

    public float calculate() {
        Float IVA = priceProduct * percentage;
        return IVA;
    }

    public float priceTotal() {
        Float total = priceProduct + this.calculate();
        return total;
    }
}
