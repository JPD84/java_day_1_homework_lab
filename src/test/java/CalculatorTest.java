import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class CalculatorTest {

    Calculator calculator;

    @Before
    public void before(){

        calculator = new Calculator();
    }


    @Test
    public void canAdd(){
        assertEquals(6, calculator.add(2, 4));
    }

    @Test
    public void canSubtract(){
        assertEquals(2, calculator.subtract(6, 4));
    }

    @Test
    public void canMultiply(){
        assertEquals(16, calculator.multiply( 4, 4));
    }

    @Test
    public void canDivide(){
        assertEquals(1.3333333, calculator.divide( 8.0, 6),0.01);
    }






}
