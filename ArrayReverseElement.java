package javaprogramming;
import java.util.*;
public class ArrayReverseElement {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Number of elements ? ");
        int n=sc.nextInt();
        System.out.println("Input "+n+" Integers ");
        int a[]=new int[n];
        for(int i=0;i<n;i++)
            a[i]=sc.nextInt();
        //Reversing Each element of the array a
        //storing it in destination array
        int b[]=new int[n];
        int ele,rev,rem;
        for(int i=0;i<n;i++){
            ele=a[i];
            rev=0;
            while(ele!=0){
                rem=ele%10;
                rev=(rev*10)+rem;
                ele=ele/10;
            }
            b[i]=rev;
        }
        
        //printing 
        System.out.println("Content of the two arrays");
        for(int i=0;i<n;i++){
            System.out.println(a[i]+"\t"+b[i]);
        }
    }
}
