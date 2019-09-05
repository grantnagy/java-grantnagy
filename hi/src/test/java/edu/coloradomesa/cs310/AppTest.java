/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.coloradomesa.cs310;

import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;
import org.junit.*;
import static org.junit.Assert.*;
/**
 *
 * @author Grant
 */
public class AppTest {
    
     public AppTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }
    
    @Test
    public void testGetDefaultWho()
    {
        System.out.println("getWho");
        App instance = new App();
        String expResult = "World";
        String result = instance.getWho();
        assertEquals(expResult, result);
    }
    
    
    
    @Test
    public void testinEnglish() 
    {
        App app = new App();
        app.setLanguage("en");
        String message = app.getMessage();
        String expect = "Hello World!";
        assertEquals(expect, message);
    }
    @Test
    public void testinChinese() 
    {
        App app = new App();
        app.setLanguage("cn");
        String message = app.getMessage();
        String expect = "你好，世界";
        assertEquals(expect, message);
    }
    /*
    @Test
    public void testSetWho() {
        System.out.println("setWho");
        String who = "";
        App instance = new App();
        instance.setWho(who);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
*/
    @Test
    public void testGetGreeting() {
        System.out.println("getGreeting");
        App instance = new App();
        String expResult = "Hello";
        String result = instance.getGreeting();
        assertEquals(expResult, result);
    
    }
/*
    @Test
    public void testSetGreeting() {
        System.out.println("setGreeting");
        String greeting = "";
        App instance = new App();
        instance.setGreeting(greeting);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    @Test
    public void testMain() throws Exception {
        System.out.println("main");
        String[] args = null;
        App.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    */
}
