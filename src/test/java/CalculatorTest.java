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

    @Test
    public void canSubtract(){
        assertEquals(75, numbers.subtractNumbers());
    }

    @Test
    public void canMultiply(){
        assertEquals(2500, numbers.multiplyNumbers());
    }

    @Test
    public void canDivide(){
        assertEquals(4, numbers.divideNumbers());
    }


}
