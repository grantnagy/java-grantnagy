/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.coloradomesa.jobexpenses;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Grant
 */
public class App {

    public static void main(String[] args) throws Exception {

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        int a, expenses = 0;

        a = in.nextInt();
        for (int i = 0; i < a; i--) {
            int b;
            b = in.nextInt();
            if (b < 0) {
                expenses += -b;
            }

            System.out.println(expenses);

        }
