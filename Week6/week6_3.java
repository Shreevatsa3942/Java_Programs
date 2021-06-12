/*
Create a class called Employee with data members: name, id, designation, salary. Write
appropriate constructors and methods for initializing the object. Implement Cloneable
interface to create a copy of the Employee object
 */
//Name:Shreevatsa
//Regno:200970093
//Date:12-06-2021
package Java_LAB.Week6;

import java.util.Scanner;

class Employee implements Cloneable{
    private int id;
    private String name,design;
    private double salary;
    
    public Employee(){
        id=0;
        name=design=null;
        salary=0;
    }
    public Employee(int id,String name,String design,double salary){
        this.id=id;
        this.name=name;
        this.design=design;
        this.salary=salary;
    }
    
    protected Object clone()throws CloneNotSupportedException{
        return super.clone();
    }
    public void display(){
        System.out.print("\nEmployee ID: "+id);
        System.out.print("\nEmployee Name: "+name);
        System.out.print("\nEmployee Designation: "+design);
        System.out.print("\nEmployee Salary:"+salary);
    }
}
public class week6_3 {
    public static void main(String[] args) throws CloneNotSupportedException {
        Scanner sc=new Scanner(System.in);
        System.out.println("\n---Employee Details---");
        System.out.print("Employee ID: ");
        int id = sc.nextInt();
        System.out.print("\nEmployee Name: ");
        String name=sc.next();
        System.out.print("\nEmployee Designation: ");
        String design=sc.next();
        System.out.print("\nEmployee Salary: ");
        double sal=sc.nextDouble();
        Employee emp=new Employee(id,name,design,sal);
        
        System.out.println("\n----original Object----");
        emp.display();
        
        //clone of emp object 
        Employee empCopy=new Employee();
        empCopy=(Employee)emp.clone();
        System.out.println("\n-----Cloned object----");
        empCopy.display();
    }
}
