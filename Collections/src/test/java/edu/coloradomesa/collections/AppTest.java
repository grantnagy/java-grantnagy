/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.coloradomesa.collections;


import java.io.PrintStream;
import java.util.Scanner;
import org.junit.*;
import static org.junit.Assert.*;

/**
 *
 * @author Grant
 */
public class AppTest {

    @Test
    public void testDuplicate() {
        App app = new App();
        app.initset();
        boolean expect = false;
        boolean result = app.mySet.add("Broncos");
        assertEquals(expect, result);
    }
    @Test
    public void testSearch() {
        App app = new App();
        app.initset();
        app.in = new Scanner("Broncos");
        app.main();
        String expect = " is from Colorado.";
        String result = PrintStream;
        assertEquals(expect, result);
    }

}
