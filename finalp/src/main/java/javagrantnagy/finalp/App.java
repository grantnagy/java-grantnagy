/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javagrantnagy.finalp;

import javax.swing.JOptionPane;

public class App {
        int small = 9, medium = 12, large = 15, cups = 0, amount = 0, small_t = 0, medium_t = 0, large_t = 0, total_cups;  //t for total
        double dsmall = 1.75, dmedium = 1.90, dlarge = 2.00, cost, total_coffee, total_money;  //d for dollars
        char sizeselect;
        
    public static void main(String[] args) {
        App app = new App();
        app.menu();
    }
void menu(){

Object[] possibilities = {"Buy Coffee", "Total Cups Sold", "Total Money Made", "Exit"};
        String s = (String) JOptionPane.showInputDialog(
                null,
                "Welcome to the Coffee Shop!\n" + "Please select from the following menu: \n", "Coffee Shop",
                JOptionPane.PLAIN_MESSAGE,
                null,
                possibilities,
                possibilities[0]);
        System.out.println(s);
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
               // show_total_money();
            default:
              //  exit;
        }
}
    void sell_coffee() {
        Object[] possibilities = {"Small: 9oz | $1.75", "Medium: 12 oz | $1.90", "Large: 15 oz | $2.00"};

        String cc = (String) JOptionPane.showInputDialog(
                null,
                "What size would you like? \n" + "Please select from the following menu: \n", "Buy Coffee",
                JOptionPane.PLAIN_MESSAGE,
                null,
                possibilities,
                possibilities[0]);
        
         System.out.println(cc);
         
         String amt = JOptionPane.showInputDialog("How many cups would you like?");
         amount = Integer.parseInt(amt);
         
         switch (cc)
	{
	case "Small: 9oz | $1.75": if (amount >= 0) {
		small_t = amount + small_t;
		cost = small_t * dsmall;
		bought();
	}
			else System.out.println("Error");

		break;
	case "Medium: 12 oz | $1.90": if (amount >= 0)
	{
		medium_t = amount + medium_t;
		cost = medium_t * dmedium;
		bought();
	}
			else System.out.println("Error");
		break;
	case "Large: 15 oz | $2.00": if (amount >= 0)
	{
		large_t = amount + large_t;
		cost = large_t * dlarge;
		bought();
	}
			else System.out.println("Error");
		break;
	default: System.out.println("Error");
	}
         
    }
    void bought(){
        JOptionPane.showMessageDialog(null, "You have bought " + amount + " cups of coffee for $" + cost);
        menu();
    }
    void show_total_cups()
    {
        total_cups = small_t + medium_t + large_t;
        JOptionPane.showMessageDialog(null, "There have been " + small_t + " small cups sold, " + medium_t + " medium cups sold, and " 
                + large_t + " large cups sold." + "\n" + "Total: " + total_cups + " Cups");
        menu();
    }
    
}
