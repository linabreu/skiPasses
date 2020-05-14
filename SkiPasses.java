/*
 * Lina Breunlin
 * Module 02 Lab
 * Part A
 * 
 * This program uses an enumeration and an array to store price information for a ski resort
 * test cases:
   Input        Output
    JAN         $135.00
    FEB         $135.00
    MAR         $110.00
    APR         $110.00
    MAY         $50.00
    JUN         $50.00
    JUL         $50.00
    AUG         $50.00
    SEP         $100.00
    OCT         $100.00
    NOV         $120.00
    DEC         $130.00
 */
package skipasses;
import java.util.Scanner;


public class SkiPasses 
{
    enum Month {JAN, FEB, MAR, APR, MAY, JUN, JUL, AUG, SEP, OCT, NOV, DEC}; 

    public static void main(String[] args) 
    {
        
     //declare variables
     double [] passPrices = {135.00, 135.00, 110.00, 110.00, 50.00, 50.00, 50.00, 50.00, 100.00, 100.00, 120.00, 130.00};
     Month visitMonth;
     String userMonth;

     
     Scanner in = new Scanner (System.in); 
     System.out.println ("Welcome to Sally's Ski Area!");
     System.out.println("Please enter the first three letters of the month you would like a ski pass for: ");
     userMonth = in.nextLine().toUpperCase();
     visitMonth = Month.valueOf(userMonth);

      switch (visitMonth)
        {
         case JAN:
         System.out.printf("The price is" + " " + "$" + "%6.2f",passPrices[0]);
         System.out.println();
         break;
         
         case FEB:
         System.out.printf("The price is" + " " + "$" + "%6.2f",passPrices[1]); 
         System.out.println();
         break;
         
         case MAR:
         System.out.printf("The price is" + " " + "$" + "%6.2f",passPrices[2]);
         System.out.println();
         break;
         
         case APR:
         System.out.printf("The price is" + " " + "$" + "%6.2f",passPrices[3]);
         System.out.println();
         break;
         
         case MAY:
         System.out.printf("The price is" + " " + "$" + "%6.2f",passPrices[4]);
         System.out.println();
         break;
         
         case JUN:
         System.out.printf("The price is" + " " + "$" + "%6.2f",passPrices[5]);
         System.out.println();
         break;
         
         case JUL:
         System.out.printf("The price is" + " " + "$" + "%6.2f",passPrices[6]);
         System.out.println();
         break;
         
         case AUG:
         System.out.printf("The price is" + " " + "$" + "%6.2f",passPrices[7]);
         System.out.println();
         break;
         
         case SEP:
         System.out.printf("The price is" + " " + "$" + "%6.2f",passPrices[8]);
         System.out.println();
         break;
         
         case OCT:
         System.out.printf("The price is" + " " + "$" + "%6.2f",passPrices[9]);
         System.out.println();
         break;
         
         case NOV:
         System.out.printf("The price is" + " " + "$" + "%6.2f",passPrices[10]);
         System.out.println();
         break;
         
         case DEC:
         System.out.printf("The price is" + " " + "$" + "%6.2f",passPrices[11]);
         System.out.println();
         break;
   
     }
      
      System.out.println("Thank you for visiting Sally's Ski Area!");
      
     }
        
    

        
    }
    








