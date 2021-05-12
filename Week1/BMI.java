/*Program:Calculate Body Mass Index*/
//Name:Shreevatsa
//Date Modified:08-05-2021
//Reg No:200970093
package Java_LAB.Week1;
import java.util.*;
public class BMI {
    public static void main(String args[]){
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter weight in KG: ");
        float weight=sc.nextFloat();
        System.out.println("Enter height in cm: ");
        float height=sc.nextFloat();
        //convert height to meters
        height=height/100;
        double bmi=weight/(height*height);
        System.out.println("BMI = "+bmi);
        if(bmi < 18.5)
            System.out.println("Underweight");
        else if(bmi < 24.9)
            System.out.println("Normal");
        else if(bmi < 29.9)
            System.out.println("Overweight !");
        else
            System.out.println("Obese");
        
    }
}
