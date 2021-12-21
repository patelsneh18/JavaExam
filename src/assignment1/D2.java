package assignment1;

import java.util.Scanner;

/**
 * Write a program to print the area of a rectangle by creating a class named 'Area' having two methods.
 * First method named as 'setDim' takes length and breadth of rectangle as parameters and
 * the second method named as 'getArea' returns the area of the rectangle.
 * Length and breadth of rectangle are entered through keyboard.
 */
class Rectangle{
    int length, breadth;

    public Rectangle(){

    }

    public void setDim(int length, int breadth){
        this.length = length;
        this.breadth = breadth;
    }

    public int getArea(){
        int area = length*breadth;
        return area;
    }
}
public class D2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int length, breadth;
        Rectangle rectangle = new Rectangle();
        length = sc.nextInt();
        breadth = sc.nextInt();
        rectangle.setDim(length, breadth);
        System.out.println("Area is " + rectangle.getArea());
    }
}
