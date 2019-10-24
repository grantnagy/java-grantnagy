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

    public static void main(String[] args) {
        app app = new app();
        app.generator();
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
}
