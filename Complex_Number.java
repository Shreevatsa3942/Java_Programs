/*Create a class ADD_NUM with two instance members num1,num2.
Create subclass ADD_REAL and ADD_COMPLEX and a method to Add() num1 and num2
using dynamic method dispatch concept.*/

//Name:Shreevatsa
//Reg no:200970093
package javaprogramming;

import java.util.Scanner;

class ADD_NUM{
    int num1,num2;

    ADD_NUM(){
        num1=num2=0;
    }
    int Add(){
        return 0;
    };
}
class ADD_REAL extends ADD_NUM{

    ADD_REAL(int num1,int num2){
        this.num1=num1;
        this.num2=num2;
    }
    //method overriding
    public int Add(){
        return (num1+num2);
    }
}
class ADD_COMPLEX extends ADD_NUM{

    ADD_COMPLEX(int num1,int num2){
        this.num1=num1;
        this.num2=num2;
    }
    //method overriding
    public int Add(){
        return (num1+num2);
    }
}
public class Complex_Number {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("\nEnter two Real Numbers: ");
        System.out.print("\n Num1 : ");int r1=sc.nextInt();
        System.out.print("\n Num2 : ");int r2= sc.nextInt();
        ADD_NUM obj1=new ADD_REAL(r1,r2);
        System.out.println("\nEnter two Complex Numbers: ");
        System.out.print("\n Num1 : ");int c1=sc.nextInt();
        System.out.print("\n Num2 : ");int c2= sc.nextInt();
        ADD_NUM obj2=new ADD_COMPLEX(c1,c2);
        System.out.println("Complex Number 1: "+(r1+" + i"+c1));
        System.out.println("Complex Number 2: "+(r2+" + i"+c2));
        int result1= obj1.Add();
        int  result2=obj2.Add();
        System.out.println("\nSum of Two Complex Numbers : "+(result1+" + i"+result2));

    }
}
