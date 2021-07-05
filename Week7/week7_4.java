/*
Given a 2-D array of size 3x3, write a multithreaded program to compute the
sum of all the elements.
Use three separate threads for computing the sum of each row of the matrix.
*/
//Name:Shreevatsa
//Regno:200970093
package Java_LAB.Week7;

import java.util.Scanner;

class Mythread extends Thread{
    private int arr[],sum,row;
    public Mythread(int arr[],int row){
        this.arr=arr;
        this.row = row;
    }
    public void run(){
        sum = Arraysum();
        display();
    }
    public int Arraysum(){
        return (arr[0]+arr[1]+arr[2]);
    }
    public void display(){
        System.out.println("Sum of Row "+row+" is : "+sum);
    }
}
public class week7_4 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int arr[][] = new int[3][3];
        System.out.println("\nEnter the elements of 3x3 matrix : ");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++)
                arr[i][j] = sc.nextInt();
        }
        Mythread t1 = new Mythread(arr[0],1);
        Mythread t2 = new Mythread(arr[1],2);
        Mythread t3 = new Mythread(arr[2],3);

        t1.start();
        t1.join();
        t2.start();
        t2.join();
        t3.start();
        t3.join();
    }
}
