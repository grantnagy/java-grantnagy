/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.coloradomesa.collections;

import java.io.PrintStream;
import java.util.*;
import java.util.ArrayList;

/**
 *
 * @author Grant
 */
public class App {

    Scanner in = new Scanner(System.in);
    PrintStream out = System.out;
    Set<Integer> mySet = new HashSet<>();
    List<Integer> myArray = new ArrayList<>();

    public static void main(String[] args) throws Exception {
        App app = new App();
        app.main();
        app.hashset();
        app.arraylist();
    }

    void main() {
        int a = 0;
        System.out.println("Type in 5 integers:");
        for (int i = 0; i < 5; i++) {
            a = in.nextInt();
            mySet.add(a);
            myArray.add(a);
        }
    }

    void hashset() {
        System.out.println("Hashset:");
        mySet.forEach((anInt) -> {
            System.out.println(anInt);
        });
    }

    void arraylist() {
        System.out.println("ArrayList:");
        myArray.forEach((anInt) -> {
            System.out.println(anInt);
        });
    }
}
