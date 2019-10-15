/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.coloradomesa.collections;

import java.io.PrintStream;
import java.util.*;

/**
 *
 * @author Grant
 */
public class App {

    Scanner in = new Scanner(System.in);
    PrintStream out = System.out;
    Set<String> mySet = new HashSet<>();

    public static void main(String[] args) throws Exception {
        App app = new App();
        app.initset();
        app.text();
        app.main();

    }

    void text() {
        System.out.println("Is your favorite sports team from Colorado? Enter your favorite team.");
        System.out.println("type 'exit' to exit");
    }

    void main() {

        while (in.hasNext()) {
            String inputString = in.nextLine();
            if (mySet.contains(inputString)) {
                System.out.println(inputString + " are from Colorado.");
            } else if (inputString.equals("exit")) {
                break;
            } else {
                System.out.println(inputString + " are not from Colorado.");
            }
        }
    }

    void initset() {

        mySet.add("Broncos");
        mySet.add("Avalanche");
        mySet.add("Rockies");
        mySet.add("Buffs");
        mySet.add("Buffaloes");
        mySet.add("Nuggets");
        mySet.add("Rams");
    }
}
