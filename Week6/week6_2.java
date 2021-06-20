/*
Create an abstract class Figure with abstract method area and two integer dimensions. Create
three more classes Rectangle, Triangle and Square which extend Figure and implement the
area method. Show how the area can be computed dynamically during run time for
Rectangle, Square and Triangle to achieve dynamic polymorphism. (Use the reference of
Figure class to call the three different area methods)
 */

//Name:Shreevatsa
//RegNumber:200970093
//Date:12-06-2021
package Java_LAB.Week6;

import java.util.Scanner;

abstract class Figure{
    protected int dim1,dim2;
    public abstract void area();
    public abstract void display();
}
class Triangle extends Figure{
    private double result;
    public Triangle(int base,int height){
        result=0;
        dim1=base;
        dim2=height;
    }
    public void area(){
        result=0.5*dim1*dim2;
    }
    public void display(){
        area();
        System.out.println("\nArea of a triangle: "+result);
    }
}

class Square extends Figure{
    private double result;
    public Square(int side){
        result=0;
        dim1=side;
    }
    public void area(){
        result=dim1*dim1;
    }
    public void display(){
        area();
        System.out.println("\nArea of a Square: "+result);
    }
}

class Rectangle extends Figure{
    private double result;
    public Rectangle(int length,int width){
        dim1=length;
        dim2=width;
        result=0;
    }
    public void area(){
        result=dim1*dim2;
    }
    public void display(){
        area();
        System.out.println("\nArea of a Rectangle: "+result);
    }
}
public class week6_2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //area of a triangle
        System.out.println("Enter base and height of a triangle : ");
        System.out.println("Base: ");
        int base =sc.nextInt();
        System.out.println("\nHeight");
        int height=sc.nextInt();
        Figure t=new Triangle(base,height);

        System.out.println("Enter the value for a side of a square: ");
        System.out.println("Side: ");
        int side=sc.nextInt();
        Figure sq=new Square(side);

        System.out.println("Enter length and width of a Rectangle: ");
        System.out.println("Length: ");
        int length=sc.nextInt();
        System.out.println("\nWidth: ");
        int width=sc.nextInt();
        Figure rect=new Rectangle(length,width);
		t.display();
		sq.display();
        rect.display();
    }
}
