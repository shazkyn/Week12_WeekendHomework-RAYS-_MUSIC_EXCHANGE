import Shop.DrumSticks;
import Shop.GuitarStrings;
import Shop.Shop;
import Shop.Picks;
import org.junit.Before;
import org.junit.Test;


import static org.junit.Assert.assertEquals;

public class ShopTest {

    DrumSticks drumSticks;
    GuitarStrings guitarStrings;
    Picks picks;
    Shop shop;


    @Before
    public void before(){
        drumSticks = new DrumSticks("Drum sticks", 5.0, 10.0);
        guitarStrings = new GuitarStrings("Guitar Strings", 10.0, 20.0);
        picks   = new Picks ("Picks", 5.0,  10.0);
        shop = new Shop();
    }

    @Test
    public void canAddStock(){
        shop.addStock(picks);
        assertEquals(shop.stockCount(), 1);
    }

    @Test
    public void canremoveStock(){
        shop.removeStock(picks);
        assertEquals(shop.stockCount(),0);
    }


}

