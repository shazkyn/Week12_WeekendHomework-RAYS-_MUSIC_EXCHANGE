package Instruments;

import Behaviour.IPlay;
import Behaviour.ISell;

public abstract class Instrument implements IPlay, ISell{

    private String colour;
    private Type type;
    private double buy_price;
    private double sell_price;

    public Instrument(String colour, Type type, double buy_price, double sell_price){
        this.colour = colour;
        this.type = type;
        this.buy_price = buy_price;
        this.sell_price = sell_price;

    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }


    public double getBuy_price() {
        return buy_price;
    }

    public void setBuy_price(int buy_price) {
        this.buy_price = buy_price;
    }

    public double getSell_price() {
        return sell_price;
    }

    public void setSell_price(double sell_price) {
        this.sell_price = sell_price;
    }

    public double getMarkUp() {
        double markUp = this.sell_price - this.buy_price;
        return markUp;
    }
}
