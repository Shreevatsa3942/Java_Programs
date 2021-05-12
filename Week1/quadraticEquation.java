/*Program:Calculate Body Mass Index*/
//Name:Shreevatsa
//Date Modified:08-05-2021
//Reg No:200970093
package Java_LAB.Week1;
import java.util.*;
import static java.lang.Math.*;
public class quadraticEquation {
    public static void main(String args[]){
		int a,b,c;
		a=Integer.parseInt(args[0]);
		b=Integer.parseInt(args[1]);
		c=Integer.parseInt(args[2]);
		double disc=(b*b) - (4*a*c);
		double r1=0.0,r2=0.0;
		if(disc > 0){
			r1= (-b+sqrt(disc))/2*a;
			r2= (-b-sqrt(disc))/2*a;
			System.out.print("\nTwo roots: "+r1+"\t"+r2+"\n");
		}
		else if(disc == 0){
			r1=-b/2*a;
			System.out.print("\nOnly one root : "+r1+"\n");
 		}
 		else
 		System.out.println("Roots are Imaginary  \n");
	}
}
