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

    private int number = 0;
    private int number2 = 0;

    public static void main(String[] args) {
        app app = new app();
        double startTime = System.currentTimeMillis();
        app.generator();
        double endTime = System.currentTimeMillis();
        double diff = endTime - startTime;
        System.out.println("Time from start to finish for desync: " + diff);
        
        /* in sync */
        
        double startTime2 = System.currentTimeMillis();
        app.same();
        double endTime2 = System.currentTimeMillis();
        double diff2 = endTime2 - startTime2;
        System.out.println("Time from start to finish for insync: " + diff2);
        
        
    }

    public void generator() {
            Thread t1 = new Thread(() -> {
                for (int i = 0; i < 100000; i++)
                    add();
            });
             Thread t2 = new Thread(() -> {
                 for (int i = 0; i < 100000; i++)
                     subtract();
            });
             
             t1.start();
             t2.start();
             
             try {
                 t1.join();
             }
             catch (InterruptedException e) {
             }
             System.out.println("Number: " + number);
    }
    public void add() {
        number++;
    }
    public void subtract() {
        number--;
    }
    

    public void same() {
            Thread t1 = new Thread(() -> {
                for (int i = 0; i < 100000; i++)
                    sadd();
            });
             Thread t2 = new Thread(() -> {
                 for (int i = 0; i < 100000; i++)
                     ssubtract();
            });
             
             t1.start();
             t2.start();
             
             try {
                 t1.join();
             }
             catch (InterruptedException e) {
             }
             System.out.println("Number 2: " + number2);
    }
    public synchronized void sadd() {
        number++;
    }
    public synchronized void ssubtract() {
        number--;
    }
    
}
