/*
A telephone company contains the records of all customer payment details of
a “Customer” like customer_id, name, phone number, Bill number,
Number of calls and bill amount.
The monthly telephone bills are calculated as per the following criteria:
Minimum Rs. 100 for the first 100 calls.
+ Rs. 0.60 per call for next 50 calls.
+ Rs. 0.50 per call for next 50 calls.
+ Rs. 0.40 per call for any call beyond 200 calls.
Create an array of objects to process the details of ‘n’ customers.
Use appropriate
constructors, and member functions to accept and display details of a customer.
Create a function Calculate_bill_amt() to calculate bill amount
*/
//Name:Shreevatsa
//Reg No:200970093

import java.util.Scanner;
class Points{
	private int x,y;
	static int i=0;
	public void input(){
		Scanner sc=new Scanner(System.in);
		i++;
		System.out.print("\nInput the coordinates of p"+i+" :");
		x=sc.nextInt();
		y=sc.nextInt();
	}
	public void display(int j){
		System.out.print("\n P"+j+" = ( "+x+", "+y+" )");
	}
	public double distance(Points p2){

		System.out.print("\nX1 : "+this.x+" X2: "+p2.x);
		System.out.print("\nY1 : "+this.y+" Y2: "+p2.y);
		double expr=((p2.x - this.x)*(p2.x - this.x))+((p2.y - this.y)*(p2.y - this.y));
		double d=Math.sqrt(expr);
		return d;
	}

}
class week4_2{
	public static void main(String args[]){

		Points p1,p2,p3;
		p1=new Points();
		p1.input();

		p2=new Points();
		p2.input();

		p3=new Points();
		p3.input();

		p1.display(1);
		p2.display(2);
		p3.display(3);

		double result;
		result=p1.distance(p2);
		System.out.println("\nDistance between p1 and p2 = "+result);
		result=p1.distance(p3);
		System.out.println("\nDistance between p1 and p3 = "+result);

		System.out.println("\n");

	}
}