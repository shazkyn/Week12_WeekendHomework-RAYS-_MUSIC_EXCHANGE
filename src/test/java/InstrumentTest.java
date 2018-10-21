import Instruments.Guitar;
import Instruments.Piano;
import Instruments.Type;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class InstrumentTest {

    Guitar guitar;
    Piano piano;

    @Before
    public void before(){
        guitar = new Guitar("Red", Type.STRINGS, 250.00, 1000.00, 6);
        piano = new Piano("Black", Type.KEYBOARD, 1000.00, 3000.00, 88);
    }

    @Test
    public void getColour() {
        assertEquals("Red", guitar.getColour());
    }

    @Test
    public void setColour() {
        guitar.setColour("Green");
        assertEquals("Green", guitar.getColour());
    }

    @Test
    public void getType() {
        assertEquals(Type.KEYBOARD, piano.getType());
    }

    @Test
    public void setType() {
        piano.setType(Type.BRASS);
        assertEquals(Type.BRASS, piano.getType());
    }

    @Test
    public void getBuy_price() {
        assertEquals(250.00, guitar.getBuy_price(), 00.1);
    }

    @Test
    public void setBuy_price() {
        guitar.setBuy_price(300);
        assertEquals(300, guitar.getBuy_price(), 0.01);
    }

    @Test
    public void getSell_price() {
        assertEquals(3000.00, piano.getSell_price(), 00.1);
    }

    @Test
    public void setSell_price() {
        piano.setSell_price(4000.00);
        assertEquals(4000.00, piano.getSell_price(), 0.01);
    }

    @Test
    public void getNumberStrings(){
        assertEquals(6, guitar.getNumberStrings());
    }

    @Test
    public void getNumberKeys(){
        assertEquals(88, piano.getNumberKeys());
    }

    @Test
    public void instrumentCanPlay(){
        assertEquals(guitar.play(), "Stairway to Heaven");
    }

    @Test
    public void getMarkup(){
        assertEquals(2000.00, piano.getMarkUp (), 0.01);
    }
}
