package org.example;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Scanner;

public class Main {
    private static final Logger logger = LogManager.getLogger(Main.class);
    public static void main(String[] args) {
        logger.info("Calculator Begins!!");
        //some changes
        Scanner reader = new Scanner(System.in);
        int op, flag=0;
        int num, exp;

        do{
            System.out.println("Operation:\n");
            System.out.println("1.Add");
            System.out.println("2.Subtract");
            System.out.println("3.Multiply");
            System.out.println("4.Percentile");
            System.out.println("5.Exit\n");
            System.out.print("Enter your option(number): \n");
            op = reader.nextInt();
            if(op==5) flag = 1;
            else{
                switch(op){

                    case 1:  // addition
                        System.out.println("Add two numbers! \n");
                        System.out.print("Enter number1: \n");
                        num = reader.nextInt();
                        System.out.print("Enter  number2: \n");
                        exp = reader.nextInt();
                        add(num,exp);
                        break;

                    case 2: // Subtract
                        System.out.println("Subtract two numbers!!\n");
                        System.out.print("Enter number1 : \n");
                        num = reader.nextInt();
                        System.out.print("Enter number2 : \n");
                        exp = reader.nextInt();
                        subt(num,exp);
                        break;

                    case 3: // Muktiply
                        System.out.println("Multiply two numbers!!\n");
                        System.out.print("Enter number1: \n");
                        num = reader.nextInt();
                        System.out.print("Enter number2: \n");
                        exp = reader.nextInt();
                        mul(num,exp);
                        break;


                    case 4: // Percentile!
                        System.out.println("Percentile Two numbers!!\n");
                        System.out.print("Enter number1: \n");
                        num = reader.nextInt();
                        System.out.print("Enter number2: \n");
                        exp = reader.nextInt();
                        per(num,exp);
                        break;

                    default:
                        System.out.println("Exiting due to invalid input!!");
                        flag = 1;
                }
            }
        }while(flag == 0);
    }

    public static long add(long num,long exp){
        long c=num+exp;
        System.out.println("\nThe Result is "+c+"\n");
        logger.info("Executing add operation for "+num+" and "+exp+". Result: "+c+"\n");
        return c;
    }

    public static long subt(long num,long exp){
        long c=num-exp;
        System.out.println("\nThe Result     is "+c+"\n");
        logger.info("Executing subtraction operation for "+num+" and "+exp+". Result: "+c+"\n");
        return c;
    }
    public static long mul(long num,long exp){
        long c = num*exp;
        System.out.println("\nThe Result is "+c+"\n");
        logger.info("Executing multiplication operation for "+num+" and "+exp+". Result: "+c+"\n");
        return c;
    }
    public static long per(long num, long exp){

        if(exp==0)
        {
            System.out.println("Error exp can't be 0");
            return 0;
        }
        long c = num%exp;
        System.out.println("\nThe Result is "+c+"\n");
        logger.info("Executing percentile/modulus operation for "+num+" and "+exp+". Result: "+c+"\n");
        return c;
    }
}