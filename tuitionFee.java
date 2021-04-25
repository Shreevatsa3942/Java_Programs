
package javaprogramming;

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
