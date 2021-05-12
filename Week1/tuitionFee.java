/*
* Program:Program to calculate tution fee of a university
* */
//Name:Shreevatsa
//Date Modified:08-05-2021
//Reg No:200970093
package Java_LAB.Week1;

import java.util.Scanner;

public class tuitionFee {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        double tuitionFee=50000;
        double fee;
        for(int i=1;i<=10;i++){
            fee=tuitionFee+((tuitionFee*5*i)/100);
            System.out.println("The fee after "+i+" year = "+fee);
        }
    }
}
