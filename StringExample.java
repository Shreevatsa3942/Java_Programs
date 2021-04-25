
package javaprogramming;

public class StringExample {
    public static void main(String args[]){
        
        //invoking string constructor 
        String str=new String("hello");
        str=str+" World ";
        System.out.println("string : "+str);
        
        //creating a reference variable of string class and assigning values to it
        //'+' is used for concatination it the whole "raghuram" + "holla" acts as an object here 
        //and we are storing that object to str2 ;
        String str2;
        str2="Raghuram "+ "Holla";
        System.out.println(str2);
    }
}
