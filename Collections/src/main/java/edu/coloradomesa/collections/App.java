/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.coloradomesa.collections;

import java.io.PrintStream;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;


/**
 *
 * @author Grant
 */
public class App {

    Scanner in = new Scanner(System.in);
    PrintStream out = System.out;
    Set<Integer> mySet = new HashSet<>();
   

    public static void main(String[] args) throws Exception {
        App app = new App();
        app.set();

    }

    void set() {

        System.out.println(mySet.add(10));
        System.out.println(mySet.add(11));
        System.out.println(mySet.add(10));

        mySet.add(11);
        mySet.add(23);
        mySet.add(39);
        mySet.add(23);
        mySet.add(40);
        mySet.add(51);

        System.out.println("Hashset:");

        for (Integer anInt : mySet) {
            System.out.println(anInt);
        }
    }

}
