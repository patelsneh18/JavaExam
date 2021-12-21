package assignment3;

import java.util.Scanner;

/**
 * To write a java program to create our exception subclass that throws exception if the sum of two integers is greater than 99.
 */

class GreaterSumException extends Exception {
    @Override
    public String toString() {
        return "Exception caught! Sum greater than 99";
    }
}

public class C2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a=sc.nextInt();
        System.out.print("Enter second number: ");
        int b=sc.nextInt();
        int sum=a+b;
        try {
            if(sum>99)
                throw new GreaterSumException();
            else
                System.out.println("Sum of two numbers: "+sum);
        }
        catch(GreaterSumException ex) {
            System.out.println(ex);
        }
    }
}
