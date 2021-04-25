/*Program:Develop a Java application to accept number of hours worked, hourly rate and determines 
the gross pay for an employee according to the following criteria:
The company pays straight time for the first 40 hours worked by each employee and time 
and a half for all hours worked in excess of 40 hours. */
//Name:Shreevatsa
//Date Modified:04-04-2021
//Reg No:200970093
package javaprogramming;

import java.util.Scanner;

public class TotalPay {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of hours worked : ");
        float hrs=sc.nextFloat();
        System.out.print("\nEnter the hourly rate : ");
        float rate=sc.nextFloat();
        double pay=0;
        if(hrs > 40){
            pay=(40*rate)+((hrs-40)*rate*1.5);
        }
        else
            pay=hrs*rate;
        System.out.println("\nThe total pay: "+pay);
    }
    
    
}
