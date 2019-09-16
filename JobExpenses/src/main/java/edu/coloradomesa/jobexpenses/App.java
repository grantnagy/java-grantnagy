/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.coloradomesa.jobexpenses;
import java.io.PrintStream;
import java.util.Scanner;
/**
 *
 * @author Grant
 */
public class App {
    Scanner in = new Scanner(System.in);
    PrintStream out = System.out;
    
    public static void main(String[] args) throws Exception {
        App app = new App();
        app.run();
    }
    
    void run() {
        while (true) {
            read();
            if (finished()) break;
            solve();
            write();
        }
    }
    
    
    
}
