/* Author: Waheeda Shariff
   Date: 04/10/2018 */

import java.util.Scanner;

public class Trains 
{

  public static void main (String[] args) 
  {
    Late();
  }

    public static void Late() 
    {
      Scanner scanner = new Scanner ( System.in );

      //Variables
      int compare = 0; 
      int total = 0;
      int onTime = 0;
      
      System.out.println("How many minutes was your train late?");
      int minutes = scanner.nextInt();

      //Late train 
      while (minutes>=0)
      {
        System.out.println("How many minutes was your train late?");
        minutes = scanner.nextInt();

        //Negative numbers
        if (minutes < 0)
        {
          break;
        }

        //On time train
        else if (minutes == 0)
        {
          onTime = onTime + 1;
        }

        //Latest train
        else if(minutes>=compare)
        {
          compare = minutes;
        }

        total = total + 1;
        
      }
      
      // Summary of trains
      System.out.println(onTime + " out of the " + total + " trains were on time.");
      System.out.println("The worst train was " + compare + " minutes lates.");
      
    }
  }

