package Instruments;

import Behaviour.IPlay;

public class Piano extends Instrument implements IPlay {

    private int numberKeys;

    public Piano(String colour, Type type, double buy_price, double sell_price, int numberKeys){
        super(colour, type, buy_price, sell_price);
        this.numberKeys = numberKeys;
    }

    public int getNumberKeys() {
        return numberKeys;
    }

    @Override
    public String play() {
        return null;
    }

    @Override
    public double markUp() {
        return 0;
    }
}
