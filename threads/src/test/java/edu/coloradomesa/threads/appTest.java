/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.coloradomesa.threads;
import org.junit.*;
import static org.junit.Assert.*;
import static org.junit.Assert.assertNotEquals;
/**
 *
 * @author Grant
 */
public class appTest {

    @Test
    public void testGen() {
        app app = new app();
        app.generator();
        int expect = app.number;
        app.generator();
        int result = app.number;
        assertNotEquals(expect, result);
    }
    @Test
    public void testSame() {
        app app = new app();
        app.same();
        int expect = app.number2;
        app.same();
        int result = app.number2;
        assertEquals(expect, result);
    }

}