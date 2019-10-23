/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.coloradomesa.threads;

/**
 *
 * @author Grant
 */
public class app {
   
    public static class MyThread extends Thread {
    @Override
        public void run(){
            System.out.println("Hello World");
            
    }
    }

    public static void main(String[] args) throws Exception { 
        Thread myThread = new MyThread();
        
        myThread.start();
    
    
    }

}
