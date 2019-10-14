/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.coloradomesa.collections;
import java.io.PrintStream;
import java.util.List;
import java.util.Scanner;
import org.junit.*;
import static org.junit.Assert.*;
/**
 *
 * @author Grant
 */
public class AppTest {

 
    @Test
    public void testArray() {
        App app = new App();
        app.mySet.add(1);
        app.mySet.add(2);
        app.mySet.add(3);
       boolean expect = false;
       boolean result = app.mySet.add(2);
       assertEquals(expect, result);
    }
 
   
   
}
