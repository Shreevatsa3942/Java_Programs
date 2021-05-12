
//Name:Shreevatsa
//Date Modified:08-05-2021
//Reg No:200970093

package Java_LAB.Week1;

import java.util.Scanner;

import static java.lang.Math.*;

public class MonthlyPayment {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("\nEnter the Loan Amount: ");
        double amt=sc.nextDouble();
        System.out.print("\nEnter Number of Years: ");
        double years= sc.nextDouble();
        System.out.println("\nInterest Rate\tMonthly Payment\tTotal Payment\n");
        for(double i=5;i<=8;i+=0.125){
            double Anual_Interest=i/100;
            double Monthly_Interest=Anual_Interest/12;
            double Monthly_payment=amt*Monthly_Interest;
            double temp=1/(pow((1+Monthly_Interest),(years*12)));
            Monthly_payment/=1-temp;
            System.out.print("\n"+i+"%\t"+Monthly_payment+"\t"+((Monthly_payment*12*years)));
        }
    }
}
