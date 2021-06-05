/*
Input two strings (S1 and S2) and two integers (N1 and N2). Perform thefollowing string operations.
•Display the upper-case equivalent of S1.
•Display the lower-case equivalent of S2.
•Extract a substring of length N2 from S1 starting at position N1.
•Insert S2 into S1 at position N1.  
•Append S2 to S1
 */
//Name:Shreevatsa
//Reg_no:200970093
package Java_LAB.Week5;

import java.util.Scanner;

class StringOperations{
    public String StringUpperCase(String str){
        char result[]=new char[str.length()];
        char c;
        for(int i=0;i<str.length();i++){
            c=str.charAt(i);
            result[i]=Character.toUpperCase(c);
        }
        return new String(result);
    }
    public String StringLowerCase(String str){
        char result[]=new char[str.length()];
        char c;
        for(int i=0;i<str.length();i++){
            c=str.charAt(i);
            result[i]=Character.toLowerCase(c);
        }
        return new String(result);
    }
    public String StringSubstring(String str,int pos,int len){
        String result="";
        str=str.substring(pos);
        for(int i=0;i<len;i++){
            result+=str.charAt(i);
        }
        return result;
    }
    public String StringInsert(String str,String str2,int pos){
        String temp=str.substring(pos);
        str=str.substring(0,pos);
        str+=str2+temp;
        return str;
    }
    public String StringAppend(String str1,String str2){
        str1+=str2;
        return str1;
    }
}
public class week5_3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("\nInput Two strings : \n");
        String s1=sc.next();
        String s2=sc.next();
        
        System.out.print("\nInput position : ");
        int n1=sc.nextInt();
        System.out.print("\nInput Length : ");
        int n2=sc.nextInt();
        StringOperations obj=new StringOperations();
        System.out.print("\nUpperCase of "+s1+" is : "+obj.StringUpperCase(s1));
        System.out.print("\nLowercase of "+s2+" is : "+obj.StringLowerCase(s2));
        System.out.print("\nSubstring of "+s1+" from position "+n1+" with length "+n2+" : "+obj.StringSubstring(s1,n1,n2));
        System.out.print("\nAfter inserting "+s2+" into "+s1+" at position "+n1+" : "+obj.StringInsert(s1, s2, n1));
       
        System.out.print("\nAfter appending "+s2+" to "+s1+" : "+obj.StringAppend(s1, s2));
        System.out.println("\n");
    }
}
