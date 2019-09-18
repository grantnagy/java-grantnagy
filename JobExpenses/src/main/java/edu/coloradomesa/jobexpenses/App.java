/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.coloradomesa.jobexpenses;
import java.io.PrintStream;
import java.util.Scanner;
/**
 *
 * @author Grant
 */
public class App {
    Scanner in = new Scanner(System.in);
    PrintStream out = System.out;
    int a,b,c,d,e, counter = 0;
    int expenses = 0;
    
 public static void main(String[] args) throws Exception {   
 App app = new App();
 app.run();
 }
 
  void run()
  {
      while (true) {
      solve();
      if (finished()) break;
      print();
      }
  }
 
  void solve() 
  {    
  while (counter < 5)
  {
       a = in.nextInt();
       if (a < 0)
         expenses += -a;
       
        b = in.nextInt();
       if (b < 0)
         expenses += -b;
       
        c = in.nextInt();
       if (c < 0)
         expenses += -c;
       
        d = in.nextInt();
       if (d < 0)
         expenses += -d;
       
        e = in.nextInt();
       if (e < 0)
         expenses += -e;
       
       
       counter++;
     }
  }
  
  boolean finished() 
    {
        return (a == 0 && b == 0 && c == 0 && d == 0 && e == 0);
    }
  
void print()
    {
  out.println(expenses);
    }
}
