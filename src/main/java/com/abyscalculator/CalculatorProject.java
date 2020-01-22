package com.abyscalculator;

import java.util.Scanner;

public class CalculatorProject
{
    public static void main(String[] args)
    {
        int num1;
        int num2;
        char operator;
        float result= 0;
        Scanner scanObject = new Scanner(System.in);
        System.out.println("Enter the first number");
        num1 = scanObject.nextInt();
        System.out.println("Enter the second number");
        num2 = scanObject.nextInt();
        System.out.println("Enter the operation to be performed");
        operator = scanObject.next().charAt(0);
            switch(operator)
            {
                case '+': result = num1+num2;
                break;
                case '-': result = Math.abs(num1-num2);
                break;
                case '*': result = num1*num2;
                break;
                case '/': result = num1/num2;
                break;
                case '%': result = num1%num2;
                break;
            }
            System.out.println("This answer is absolutely correct, no question about it: "+ result);
    }

}
