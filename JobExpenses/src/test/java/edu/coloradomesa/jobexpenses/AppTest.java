
package edu.coloradomesa.jobexpenses;
import java.util.Scanner;
import org.junit.*;
import static org.junit.Assert.*;
/**
 *
 * @author Grant
 */
public class AppTest {

 
    @Test
    public void testMain() {
        App app = new App();
        String EOL = System.lineSeparator();
        app.in = new Scanner("3" + EOL
                + "1 -2 3");
        app.main();
        int expect = 2;
        int result = app.expenses;
        assertEquals(expect, result);
    }
    
    @Test
    public void testMain2() {
        App app = new App();
        String EOL = System.lineSeparator();
        app.in = new Scanner("4" + EOL
                + "1 -2 -5 1");
        app.main();
        int expect = 7;
        int result = app.expenses;
        assertEquals(expect, result);
    }
    @Test
    public void testa() {
        App app = new App();
        String EOL = System.lineSeparator();
        app.in = new Scanner("7" + EOL
                + "3 -45 -1 11 12 4 3");
        app.main();
        int expect = 7;
        int result = app.a;
        assertEquals(expect, result);
    }
   
   
}
