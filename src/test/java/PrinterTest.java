import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PrinterTest {

    printer Printer;

    @Before
    public void before(){

        printer = new Printer (150);
    }

    @Test
    public void printPages(){
        printer.print();
        assertEquals( 130, printer.print);
    }


}
