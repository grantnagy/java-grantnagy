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
import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.io.PrintStream;

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
    public void testSearchTrue() {
        PrintStream originalOut = System.out;
        OutputStream os = new ByteArrayOutputStream();
        PrintStream ps = new PrintStream(os);
        System.setOut(ps);
        String EOL = System.lineSeparator();
        App app = new App();
        app.initset();
        app.in = new Scanner("Broncos");
        app.main();
        String expect = "Broncos are from Colorado." + EOL;
        assertEquals(expect, os.toString());
        System.setOut(originalOut);
    }
    @Test
    public void testSearchFalse() {
        PrintStream originalOut = System.out;
        OutputStream os = new ByteArrayOutputStream();
        PrintStream ps = new PrintStream(os);
        System.setOut(ps);
        String EOL = System.lineSeparator();
        App app = new App();
        app.initset();
        app.in = new Scanner("Chiefs");
        app.main();
        String expect = "Chiefs are not from Colorado." + EOL;
        assertEquals(expect, os.toString());
        System.setOut(originalOut);
    }

}
