/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javagrantnagy.finalp;

import javax.swing.JOptionPane;

public class App {

    public static void main(String[] args) {
        App app = new App();

        int small = 9, medium = 12, large = 15, cups = 0, amount = 0, small_t = 0, medium_t = 0, large_t = 0, total_cups;  //t for total
        double dsmall = 1.75, dmedium = 1.90, dlarge = 2.00, cost, total_coffee, total_money;  //d for dollars
        char sizeselect;

        Object[] possibilities = {"Buy Coffee", "Total Cups Sold", "Total Money Made", "Exit"};
        String s = (String) JOptionPane.showInputDialog(
                null,
                "Welcome to the Coffee Shop!\n" + "Please select from the following menu: \n", "Coffee Shop",
                JOptionPane.PLAIN_MESSAGE,
                null,
                possibilities,
                possibilities[0]);

        switch (s) {
            case "Buy Coffee":
                sell_coffee();
                break;
            case "Total Cups Sold":
                show_total_cups();
                break;
            case "Exit":
                break;
            case "Total Money Made":
                show_total_money();
            default:
                exit;
        }
        
        
        
        
        System.out.println(s);

    }

}
