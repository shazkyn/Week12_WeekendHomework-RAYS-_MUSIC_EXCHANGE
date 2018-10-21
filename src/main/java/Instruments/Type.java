
package Instruments;

public enum Type {
    BRASS("Brass"),
    STRINGS("String"),
    WOODWIND("Woodwind"),
    PERCUSSION("Percussion"),
    KEYBOARD("Keyboard");

    private final String type;

    Type(String type){
        this.type = type;
    }

    public String canGetType(){
        return this.type;
    }
}