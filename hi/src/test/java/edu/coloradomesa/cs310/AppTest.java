/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.coloradomesa.cs310;

import org.junit.*;
import static org.junit.Assert.*;
/**
 *
 * @author Grant
 */
public class AppTest {
    
    public AppTest() {
    }
    
    @Test
    public void testGetNonDefaultWho() {
        System.out.println("getWho");
        App instance = new App();
        String expResult = "";
        String result = instance.getWho();
        assertEquals(expResult, result);
    }
    @Test
    public void testSetWho() {
        System.out.println("setWho");
        String who = "";
        App instance = new App();
        instance.setWho(who);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getGreeting method, of class App.
     */
    @Test
    public void testGetGreeting() {
        System.out.println("getGreeting");
        App instance = new App();
        String expResult = "";
        String result = instance.getGreeting();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setGreeting method, of class App.
     */
    @Test
    public void testSetGreeting() {
        System.out.println("setGreeting");
        String greeting = "";
        App instance = new App();
        instance.setGreeting(greeting);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of main method, of class App.
     */
    @Test
    public void testMain() throws Exception {
        System.out.println("main");
        String[] args = null;
        App.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
