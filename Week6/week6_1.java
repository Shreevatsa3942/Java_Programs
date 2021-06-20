/*
Create three classes as per the following specifications:
• Student: Data members are Register Number, Name, Course and Semester.
• Exam (derived from class Student): Data members are the marks scored in three subjects.
• Result (derived from class Exam): Data members are Total Marks and Grade.
Implement get_data() and display() methods using the concept of method overriding
*/
//Name:Shreevatsa
//RegNumber:200970093
//Date:12-06-2021
package Java_LAB.Week6;

import java.util.Scanner;

class Student{
    protected long regno;
    protected String name,course;
    protected int sem;
    static int scount=0;
    Student(){
        name=course=null;
        regno=0;
        sem=0;
    }
    public void get_data(){
        Scanner sc=new Scanner(System.in);
        System.out.println("\n---Enter Student Details----");
        System.out.print("\nRegistration number:");
        regno=sc.nextLong();
        System.out.print("\nName:");
        name=sc.next();
        System.out.print("\nCourse:");
        course=sc.next();
        System.out.print("\nSemester:");
        sem=sc.nextInt();
    }
    public void display(){
        scount++;

        System.out.println("\n-----Details of Student: "+scount+" -----");
        System.out.println("Registration Number: "+regno);
        System.out.println("Student Name: "+name);
        System.out.println("Course: "+course);
        System.out.println("Semester: "+sem);
    }
}
class Exam extends Student{
    protected int sub1,sub2,sub3;

    public Exam(){
        super();
        sub1=sub2=sub3=0;
    }
    @Override
    public void get_data(){

        super.get_data();

        Scanner sc=new Scanner(System.in);
        System.out.println("\n---Enter Student Marks Details----");
        System.out.print("\nSubject1:");
        sub1=sc.nextInt();
        System.out.print("\nSubject2:");
        sub2=sc.nextInt();
        System.out.print("\nSubject3:");
        sub3=sc.nextInt();

    }
    @Override
    public void display(){
        super.display();
        System.out.println("Subject 1: "+sub1);
        System.out.println("Subject 2: "+sub2);
        System.out.println("Subject 3: "+sub3);

    }
}
class Result extends Exam{
    private double total,grade;
    public Result(){
        super();
        total=grade=0;
    }
    @Override
    public void get_data(){
        super.get_data();
    }
    public void calculate(){
        total=sub1+sub2+sub3;
        grade=total/3;
    }
    @Override
    public void display(){
        calculate();
        super.display();
        System.out.println("Total: "+total);
        System.out.println("Grade: "+grade);

    }

}
public class week6_1 {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("\nEnter the number of students: ");
        int n=sc.nextInt();

        //Result res=new Result();
        //res.get_data();
        //res.display();
        Result[] r=new Result[n];
        for(int i=0;i<n;i++){
			r[i]=new Result();
            r[i].get_data();
        }
        for(int i=0;i<n;i++){
            r[i].display();
        }
    }
}
