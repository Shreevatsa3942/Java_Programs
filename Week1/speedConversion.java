/*Program:Java program to convert the input speed from kilometre per hour to meters per
second and vice versa.*/
//Name:Shreevatsa
//Date Modified:08-05-2021
//Reg No:200970093
package Java_LAB.Week1;

import java.util.Scanner;

public class speedConversion {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int ch;
        do{
        System.out.println("\n\n1.KM per hour to Meter per Second\n2.Meter per Second to KM per Hour\n");
        System.out.print("Enter your choice (0 to stop): ");
        ch=sc.nextInt();
        double speed=0,converted_speed=0;
        switch (ch){
			case 0:
				System.exit(0);
            case 1:
                System.out.print("\nEnter speed in KMPH : ");
                speed=sc.nextDouble();
                converted_speed=speed*1000/3600;
                System.out.println("Speed in Meter per Second: "+converted_speed+" Mps");
                break;
            case 2:
                System.out.print("\nEnter speed in Meter per Second : ");
                speed=sc.nextDouble();
                converted_speed=speed*3600/1000;
                System.out.println("Speed in KMPH: "+converted_speed+" KMPH");
                break;
            default:
                System.out.println("Invalid Choice :");

        }
		}while(true);
    }
}
