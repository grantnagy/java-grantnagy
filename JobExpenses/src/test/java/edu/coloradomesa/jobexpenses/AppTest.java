
package edu.coloradomesa.jobexpenses;
import java.util.Scanner;
import org.junit.*;
import static org.junit.Assert.*;

import java.io.PrintStream;
import java.io.ByteArrayOutputStream;

/**
 *
 * @author Grant
 */
public class AppTest {

    App ex1() {
        App app = new App();
        app.a = 3;
        app.b = 1;
        app.c = -2;
        app.d = 3;
        app.expenses = 2;
        return app;
    }
    
    
    
    
    @Test
    public void testRun() {
        App app = new App();
        
        String EOL = System.lineSeparator();
        app.in = new Scanner("3" + EOL
                + "1" + "-2" + "3"+ EOL);
        var bos = new ByteArrayOutputStream();
        app.out = new PrintStream(bos);
        app.run();
        app.out.close();
        String expect = "2";
        String result = bos.toString();
        assertEquals(expect, result);
    }
   /** @Test
    public void testGetDefaultWho()
    {
        System.out.println("getWho");
        App instance = new App();
        String expResult = "World";
        String result = instance.getWho();
        assertEquals(expResult, result);
    }
    * **/
}