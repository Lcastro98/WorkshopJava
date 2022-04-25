package Exercise4;

import java.awt.geom.Arc2D;

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
}
