package Instruments;


import Behaviour.IPlay;

public class Guitar extends Instrument implements IPlay {

    private int numberStrings;

    public Guitar(String colour, Type type, double buy_price, double sell_price, int numberStrings){
        super(colour, type, buy_price, sell_price);
        this.numberStrings = numberStrings;
    }

    public int getNumberStrings(){
        return numberStrings;
    }

    public String play() {
        return "Stairway to Heaven";
    }

    @Override
    public double markUp() {
        return 0;
    }
}