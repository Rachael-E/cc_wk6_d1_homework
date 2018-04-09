import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    private Calculator numbers;

    @Before
    public void before(){
        numbers = new Calculator(100, 25);
    }

    @Test
    public void canAdd(){
        assertEquals(125, numbers.addNumbers());
    }
    


}
