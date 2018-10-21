package Shop;

import Behaviour.ISell;

public class GuitarStrings extends Accessories implements ISell {

    public GuitarStrings(String item, double buyPrice, double sellPrice){
        this.item = item;
        this.buyPrice = buyPrice;
        this.sellPrice = sellPrice;
    }

    @Override
    public double markUp() {
        return 0.5;
    }
}