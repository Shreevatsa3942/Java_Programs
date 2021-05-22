
/*Program:Write a program to read an array of n distinct numbers, and display all the pairs (x,y) such 
that x>y.*/
//Name:Shreevatsa
//Date Modified:04-04-2021
//Reg No:200970093
package javaprogramming;
import java.util.*;
public class ArrayPairs {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number of Elements: ");
        int n=sc.nextInt();
        System.out.println("Enter the Array Elements: ");
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        System.out.println("(X,Y) Pairs: ");
        System.out.print("Output : { ");
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(a[i]>a[j]){
                    System.out.print("( "+a[i]+","+a[j]+" )");
                    System.out.print(", ");
                }
            }
        }
        System.out.print(" }");
    
    }
}
