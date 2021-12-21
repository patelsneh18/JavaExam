package assignment1;

/**
 * 1.Write a program to print the area and perimeter of a triangle having sides of 3, 4 and 5 units
 * by creating a class named 'Triangle' without any parameter in its constructor.
 */
class Triangle
{
    public int s1,s2,s3;
    public Triangle(){

    }

}
public class C1 {
    public static void main(String[] args)
    {
        Triangle triangle = new Triangle();
        triangle.s1 = 3;
        triangle.s2 = 4;
        triangle.s3 = 5;
        int peri=(triangle.s1+triangle.s2+triangle.s3);
        System.out.println("perimeter is:"+peri);
        int sp=(peri/2);
        int ar=sp*(sp-triangle.s1)*(sp-triangle.s2)*(sp-triangle.s3);
        int area=(int)Math.sqrt(ar);
        System.out.println("Area is:"+area);

    }
}
