package Shop;

import Behaviour.ISell;

public abstract class Accessories implements ISell {

    String item;
    double buyPrice;
    double sellPrice;

    public String getItem() {
        return item;
    }
    public double getBuyPrice() {
        return buyPrice;
    }
    public double getSellPrice() {
        return sellPrice;
    }

}
