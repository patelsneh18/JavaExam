package assignment1;

import java.util.Scanner;

/**
 * 2.Print the average of three numbers entered by user by creating a class named 'Average'
 * having a method to calculate and print the average.
 */
public class C2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number 1: ");
        int n1 = sc.nextInt();
        System.out.print("Enter number 2: ");
        int n2 = sc.nextInt();
        System.out.print("Enter number 3: ");
        int n3 = sc.nextInt();

        double average = (n1+n2+n3)/3;

        System.out.println("Average is: " + average);
    }
}
