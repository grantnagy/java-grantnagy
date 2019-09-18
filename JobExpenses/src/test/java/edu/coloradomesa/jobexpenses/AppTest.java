
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
    
    App ex2() {
        App app = new App();
        app.a = 5;
        app.b = 10;
        app.c = -2;
        app.d = -2;
        app.e = 21;
        app.expenses = 4;
        return app;
    }

    App ex3() {
        App app = new App();
        app.a = 100;
        app.b = 1000;
        app.c = -100;
        app.d = 50;
        app.e = -2;
        app.expenses = 102;
        return app;
    }
   

    App ex(int k) {
        switch (k) {
            case 1:
                return ex1();
            case 2:
                return ex2();
            case 3:
                return ex3();
        }
        throw new IndexOutOfBoundsException("k=" + k);
    }

    void assertAppInEquals(App expect, App result) {
        assertEquals(expect.a, result.a);
        assertEquals(expect.b, result.b);
        assertEquals(expect.c, result.c);
        assertEquals(expect.d, result.d);
        assertEquals(expect.e, result.e);
    }

    void assertAppOutEquals(App expect, App result) {
        assertEquals(expect.expenses, result.expenses);
    }

    public void testSample(int testcase) {
        App expected = ex(testcase);
        App result = ex(testcase);
        result.expenses = 0;
        assertAppOutEquals(expected, result);
    }

    @Test
    public void testSample1() {
        testSample(1);
    }

    @Test
    public void testSample2() {
        testSample(2);
    }

    @Test
    public void testSample3() {
        testSample(3);
    }
    @Test
    public void testFinished() {
        App app = ex1();
        app.a = 0;
        app.b = 0;
        app.c = 0;
        app.d = 0;
        app.e = 0;
        assertTrue(app.finished());
    }

    @Test
    public void testRun() {
        App app = new App();
        
        String EOL = System.lineSeparator();
        app.in = new Scanner("3" + EOL
                + "1 -2 3" + EOL);
        var bos = new ByteArrayOutputStream();
        app.out = new PrintStream(bos);
        app.run();
        app.out.close();
        String expect = "2";
        String result = bos.toString();
        assertEquals(expect, result);
    }
}
