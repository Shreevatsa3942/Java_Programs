/*
Input an integer n. Calculate and display the squares and cubes of all
integers from 1 to n using two different threads.
 */
//Name:Shreevatsa
//Regno:200970093
package Java_LAB.Week7;

import java.util.*;

class squares implements Runnable{
    private int n;
    public squares(int n){
        this.n=n;
    }
    public void run(){
        for(int i=1;i<=n;i++){
            System.out.println("Square of "+i+" : "+(i*i));
        }
    }
}
class cubes implements Runnable{
    private int n;
    public cubes(int n){
        this.n=n;
    }
    public void run(){
        for(int i=1;i<=n;i++){
            System.out.println("Cube of "+i+" : "+(i*i*i));
        }
    }
}
public class week7_3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("\nEnter the value for n: ");
        int n=sc.nextInt();
        squares sq=new squares(n);
        cubes cb=new cubes(n);

        Thread t1=new Thread(sq);
        Thread t2=new Thread(cb);

        try {
            t1.start();
            t1.join();
            t2.start();
            t2.join();
        }
        catch (Exception ex) {
            System.out.println(ex);
        }

    }
}
