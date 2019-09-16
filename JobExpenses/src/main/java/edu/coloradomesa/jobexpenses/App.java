/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.coloradomesa.jobexpenses;
import java.io.PrintStream;
import java.util.Scanner;
import java.io.*;
import java.util.*;
/**
 *
 * @author Grant
 */
public class App {
    
    int a,b,c,d;
    int expenses;
    
    
    public static void main(String[] args) throws Exception {
        App app = new App();
        app.run();
    }
    
    void run()
    {
        read();
        solve();
        write();
    }
    
    void write()
    {
       out.println(expenses);
    }
    
    
    void read() {
        a = in.nextInt();
        b = in.nextInt();
        c = in.nextInt();
        d = in.nextInt();
        
    }
    
    
 void solve () {
     
      
 }
     
    
}
