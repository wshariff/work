import java.util.Scanner;
import java.io.*;
import java.io.IOException;

public class ShortLevel9
{
    public static void main(String[] param)
    {
     Scanner scan = new Scanner(System.in);
     System.out.println("Please input the expression ");
     String userinput = scan.next();

     int uservalue = userexpression(userinput);
     System.out.println("The answer is " + uservalue);
    }   
    
    public static int userexpression(String exp)
    {
        int result = 0;

        //First position is an expression
        if (exp.charAt(0) == '+' || exp.charAt(0) == '-' || exp.charAt(0) == '*' || exp.charAt(0) == '!')
        {
            //Adding expressionm
            if(exp.charAt(0) == '+')
            {
                //Checking second expression
                if(exp.charAt(2) == '+' || exp.charAt(2) == '-' || exp.charAt(2) == '*' || exp.charAt(2) == '!')
                {
                return Integer.parseInt(String.valueOf(exp.charAt(1))) + userexpression(exp.substring(2,exp.length()));
                }

                //Second position is an integer 
                else
                {
                result = Integer.parseInt(String.valueOf(exp.charAt(1))) +Integer.parseInt(String.valueOf(exp.charAt(2)));
                }
            }

            //Substraction expression
            if(exp.charAt(0) == '-')
            {
                //Checking second expression
                if(exp.charAt(2) == '+' || exp.charAt(2) == '-' || exp.charAt(2) == '*' || exp.charAt(2) == '!')
                {
                return Integer.parseInt(String.valueOf(exp.charAt(1))) - userexpression(exp.substring(2,exp.length()));
                }

                //Second position is an integer 
                else
                {
                result = Integer.parseInt(String.valueOf(exp.charAt(1))) - Integer.parseInt(String.valueOf(exp.charAt(2)));
                }
            }

            //Multiplication expression
            if(exp.charAt(0) == '*')
            {
                //Checking second expression
                if(exp.charAt(2) == '+' || exp.charAt(2) == '-' || exp.charAt(2) == '*' || exp.charAt(2) == '!')
                {
                return Integer.parseInt(String.valueOf(exp.charAt(1))) * userexpression(exp.substring(2,exp.length()));
                }

                //Integer 
                else
                {
                result = Integer.parseInt(String.valueOf(exp.charAt(1))) * Integer.parseInt(String.valueOf(exp.charAt(2)));
                }
            }

            //Factorial expressions
            if(exp.charAt(0)=='!')
            {
                //Checking first expression 
                if(exp.charAt(1) == '+' || exp.charAt(1) == '-' || exp.charAt(1) == '*' || exp.charAt(1) == '!')
                {
                    return fact(userexpression(exp.substring(1,exp.length())));
                }
                result = fact(Integer.parseInt(String.valueOf(exp.charAt(1))));
                return result;
            }

        }

        //Only a number 
        else
        {
            result = Integer.parseInt(String.valueOf(exp.charAt(0)));
            return result;
        }

        return result;
    }

    public static int fact(int value)
    {
        int factnum = 1;
        for(int i = 1; i <=value; i++)
        {
            factnum = factnum*i;
        }
        return factnum;
    }
}






  





              