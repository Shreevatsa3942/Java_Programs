
package JavaExamples;

import java.util.Scanner;

class employee{
    Scanner sc=new Scanner(System.in);
    final static String ceo="Vaishnav";
    
    int id;
    String name;
//    public void input(){
//        id=sc.nextInt();
//        name=sc.next();
//    }
    public void display(){
        System.out.println("CEO: "+ceo);
        System.out.println("ID: "+id);
        System.out.println("Name: "+name);
    }
}
public class StaticExample2 {
    public static void main(String args[]){
        
        employee e1=new employee();
        //e1.ceo="raghu";
        //e1.ceo="raj";
        e1.id=101;
        e1.name="Akshata";
        employee e2=new employee();
        //e2.ceo="Ram";
        e2.id=102;
        e2.name="Raj";
        
        e1.display();
        e2.display();
    }
}
