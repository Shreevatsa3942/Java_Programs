/*
Write a program to enter student’s Name, Roll Number and Marks in three subjects,
find the percentage, grade, and handle NumberFormatException.
Validate marks to be in the range 0-100 by creating an exception called
MarkOutofBoundsException and throw it.
 */
//Name:Shreevatsa
//RegNo:200970093

import java.util.*;
class MarkOutofBoundsException extends Exception{
    MarkOutofBoundsException(String s){
        System.out.println(s);
    }
}
class student{
	private String sname;
	private int rno,m1,m2,m3;
        private double total,avg;
        private char grade;
	public student(){
		rno=0;
		sname=null;
		m1=m2=m3=0;
                total=avg=0;
	}
        public void input(){
            try {
                Scanner sc = new Scanner(System.in);
                System.out.println("\n-----Student Details------");
                System.out.print("\nRegistration Number : ");
                rno=Integer.parseInt(sc.next());
                System.out.print("\nStudent Name : ");
                sname=sc.next();
                System.out.print("\nSubject1 : ");
                m1=Integer.parseInt(sc.next());
                System.out.print("\nSubject2 : ");
                m2=Integer.parseInt(sc.next());
                System.out.print("\nSubject3 : ");
                m3=Integer.parseInt(sc.next());
            } catch (NumberFormatException e) {
                System.out.println("Exception "+e);
            }
        }
        public boolean validateMarks() throws MarkOutofBoundsException{
            if((m1>100||m1<0) || (m2>100||m2<0) || (m3>100||m3<0)){
                throw new MarkOutofBoundsException("Mark range is invalid!!");
            }
            else
                return true;
        }

        public void calculateGrade() throws MarkOutofBoundsException{
            if(validateMarks()){
                total = m1+m2+m3;
                avg = total/3;
                if(m1>35 && m2>35 && m3>35){
                	if(avg > 90)
                    	grade='A';
                	else if(avg > 80)
                    	grade='B';
                	else if(avg > 70)
                    	grade='C';
                	else if(avg > 60)
                    	grade='D';
                	else if(avg > 35)
                    	grade='E';
                	else grade='F';
				}
				else grade='F';
            }
        }

        @Override
        public String toString(){
            String output = "\nRegistration Number: "+this.rno+"\nStudent Name : "+this.sname+"\nSubject1 : "+this.m1+"\nSubject2 :"+this.m2+"\nSubject3 : "+this.m3+"\nTotal : "+this.total+"\nGrade : "+this.grade;
            return output;
        }
}
public class week7_1 {
    public static void main(String[] args) throws Exception {
        student s = new student();
        s.input();
        s.calculateGrade();
        System.out.println("\n-------student details-----\n"+s);
    }
}
