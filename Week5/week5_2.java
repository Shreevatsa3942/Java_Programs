/*
Program:nput a string. Rearrange the characters in it in alphabetic order 
(E.g., COMPUTER should be written in the form of CEMOPRTU).Rearranging should be done for the two cases:
• Considering the upper/lower case of alphabets
• Without considering the upper/lower case of alphabets
 */
//Name:Shreevatsa
//Reg_no:200970093
package Java_LAB.Week5;

import java.util.Scanner;

class ArrangeStrings{
    private String str;
    public ArrangeStrings(String str){
        this.str=str;
    }
    public String ArrangeWithCase(){
        char arr[]=str.toCharArray();
        char temp;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        String result=new String(arr);
        return result;
    }
    public String ArrangeWithoutCase(){
        char arr[]=str.toCharArray();
        char temp;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(Character.toUpperCase(arr[i])>Character.toUpperCase(arr[j])){
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        String result=new String(arr);
        return result;
    }
}
public class week5_2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("\nEnter a string : ");
        String str=sc.next();
        ArrangeStrings obj1 = new ArrangeStrings(str);
        String arrange1=obj1.ArrangeWithCase();
        System.out.print("\nOutput String(with case): "+arrange1);
        String arrange2=obj1.ArrangeWithoutCase();
        System.out.print("\nOutput String(with case): "+arrange2);
        System.out.println("\n");
    }
}
