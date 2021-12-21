package assignment1;

/**
 * 1.Print the sum, difference and product of two complex numbers by creating a class named 'Complex'
 * with separate methods for each operation whose real and imaginary parts are entered by user.
 */
class ComplexNumber {

    //for real and imaginary parts of complex numbers
    double real, img;
    //constructor to initialize the complex number

    ComplexNumber(double real, double i) {
        this.real = real;
        this.img = i;
    }

    public ComplexNumber sum(ComplexNumber c1, ComplexNumber c2) {
        //creating a temporary complex number to hold the sum of two numbers
        ComplexNumber temp = new ComplexNumber(0, 0);
        temp.real = c1.real + c2.real;
        temp.img = c1.img + c2.img;
        //returning the output complex number
        return temp;
    }

    public ComplexNumber subtract(ComplexNumber c1, ComplexNumber c2) {
        //creating a temporary complex number to hold the sum of two numbers
        ComplexNumber temp = new ComplexNumber(0, 0);
        temp.real = c1.real - c2.real;
        temp.img = c1.img - c2.img;
        //returning the output complex number
        return temp;
    }

    public ComplexNumber multiply(ComplexNumber c1, ComplexNumber c2) {
        //creating a temporary complex number to hold the sum of two numbers
        ComplexNumber temp = new ComplexNumber(0, 0);
        temp.real = c1.real * c2.real;
        temp.img = c2.img*c1.real + c1.img*c2.real + c1.img*c2.img;
        //returning the output complex number
        return temp;
    }
}

public class D1 {
    public static void main(String args[]) {
        ComplexNumber c1 = new ComplexNumber(5.5, 4);
        ComplexNumber c2 = new ComplexNumber(1.2, 3.5);
        ComplexNumber sum = c1.sum(c1, c2);
        ComplexNumber sub = c1.subtract(c1, c2);
        ComplexNumber multiply = c1.multiply(c1, c2);
        System.out.println("Sum is: " + sum.real + " + " + sum.img + "i");
        System.out.println("Subtraction is: " + sub.real + " + " + sub.img + "i");
        System.out.println("Multiplication is: " + multiply.real + " + " + multiply.img + "i");
    }
}
