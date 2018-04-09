import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WaterbottleTest {

    private Waterbottle waterVolume;

    @Before
    public void before(){
        waterVolume = new Waterbottle(100);
    }

    @Test
    public void hasVolume(){
        assertEquals(100, waterVolume.getVolume());
    }

    @Test
    public void takesDrink(){
        waterVolume.drink();
        waterVolume.drink();
        assertEquals(80, waterVolume.getVolume());
    }

    @Test
    public void empty(){
        assertEquals(0, waterVolume.emptyBottle());
    }


}
