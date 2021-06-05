/*Program: Input a string. Reverse it. Check whether it is a palindrome or not.
Note: Write a separate function for reversing the string*/
//Name:Shreevatsa
//Reg_no:200970093
package Java_LAB.Week5;

import java.util.Scanner;
class Pallindrome{
    public String reverse_str(String str){
        String result="";
        for(int i=str.length()-1;i>=0;i--){
            result+=str.charAt(i);
        }
        System.out.println("Reverse: "+result);
        return result;
    }
    public boolean isPallindrome(String str1){
        String str2=reverse_str(str1);
        return str1.equals(str2);
    }
}
class week5_1{
    
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("\nEnter a string:");
        String str=sc.next();
        str=str.trim();
        Pallindrome p=new Pallindrome();
        if(p.isPallindrome(str)){
            System.out.println("\nPallindrome");
        }
        else
            System.out.println("\nNot a Pallindrome");
        
    }
}