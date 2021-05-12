/*
* Program:
Write a java program to accept distance travelled (in kilometre) and the quantity of fuel
used (in litre) for a journey and determine the average fuel economy for that journey. Based
on this, perform the following two operations for the user:
� Fuel estimation: Estimate the fuel needed for the distance entered by the user.
� Distance estimation: Estimate the distance that can be travelled for the quantity of
fuel entered by the user.
*/
//Name:Shreevatsa
//Date Modified:08-05-2021
//Reg No:200970093
package Java_LAB.Week1;

import java.util.Scanner;

public class fuelEstimation {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
		System.out.print("\nEnter the distance(in KM): ");
		double km=sc.nextDouble();
        System.out.print("\nEnter the fuel Consumed (in Litre) : ");
        double ltr=sc.nextDouble();
        double economy=km/ltr;
        System.out.println("\nAverage Fuel Economy: "+economy);
        double fuel=0;
        do{
            System.out.println("\n1.Distance Estimation\n2.Fuel Estimation\nEnter your choice (0 to stop):");
            int ch=sc.nextInt();
            switch (ch){
                case 0:
                    System.exit(0);
                case 1:
                    System.out.print("\nEnter the Fuel Consumed in Litres :");
                    ltr=sc.nextDouble();
                    fuel = ltr * economy;
                    System.out.println("\nEstimated Distance : "+fuel+" kmpl");
                    break;
                case 2:
                    System.out.print("\nEnter distance in kilometers :");
                    km=sc.nextDouble();
                    fuel = km / economy;
                    System.out.println("\nEstimated Fuel : "+fuel);
                    break;
                default:
                    System.out.println("\nInvalid Choice: ");

            }
        }while(true);
    }
}
