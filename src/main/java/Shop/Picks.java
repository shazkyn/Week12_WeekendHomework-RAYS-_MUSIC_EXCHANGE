package Shop;

import Behaviour.ISell;

public class Picks extends Accessories implements ISell {

    public Picks(String item, double buyPrice, double sellPrice){
        this.item = item;
        this.buyPrice = buyPrice;
        this.sellPrice = sellPrice;
    }

    @Override
    public double markUp() {
        return 1.0;
    }
}