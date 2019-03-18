import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WaterBottleTest {

    WaterBottle waterbottle;

    @Before
    public void before(){

        waterbottle = new WaterBottle(100);
    }

    @Test
    public void canDrink() {
        waterbottle.drink();
        assertEquals( 90, waterbottle.volume());
    }

    @Test
    public void emptyBottle(){
        waterbottle.empty();
        assertEquals(0, waterbottle.volume());
    }

    @Test
    public void fillBottle(){
        waterbottle.empty();
        waterbottle.fill();
        assertEquals(100, waterbottle.volume());
    }
}
