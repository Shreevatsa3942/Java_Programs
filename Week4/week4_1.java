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
class Customer{
	private String cust_id,cust_name;
	private long phone_num,bill_no;
	private int no_of_calls;
	private double bill_amt;

	public Customer(String cust_id,String cust_name, long phone_num,long bill_no,int no_of_calls){
		this.cust_id=cust_id;
		this.cust_name=cust_name;
		this.phone_num=phone_num;
		this.bill_no=bill_no;
		this.no_of_calls=no_of_calls;

	}
	public void Calculate_bill_amt(){
		if(no_of_calls <= 100){
			bill_amt=no_of_calls*1;
		}
		else if(no_of_calls <= 150){
			bill_amt=100;
			int rem_calls=no_of_calls-100;
			bill_amt+=(rem_calls*0.60);
		}
		else if(no_of_calls <= 200){
			bill_amt=100;
			int rem_calls=no_of_calls-100;
			bill_amt+=((rem_calls-50)*0.60);
			rem_calls-=50;
			bill_amt+=(rem_calls*0.50);

		}
		else{
			bill_amt=100;
			int rem_calls=no_of_calls-100;
			bill_amt+=((rem_calls-50)*0.60);
			rem_calls-=50;
			bill_amt+=((rem_calls-50)*0.50);
			rem_calls-=50;
			bill_amt+=(rem_calls*0.40);
		}
	}
	public void display(){
		Calculate_bill_amt();
		System.out.println("\nCustomer ID: "+cust_id);
		System.out.println("Customer Name: "+cust_name);
		System.out.println("Customer Phone no: "+phone_num);
		System.out.println("Customer Bill_No: "+bill_no);
		System.out.println("Number of calls: "+no_of_calls);
		System.out.println("Total Bill: "+bill_amt);

	}
}
class week4_1{
	public static void main(String args[]){

		Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of Customers: ");
		int n=sc.nextInt();

		String cust_id,cust_name;
		long phone_num,bill_no;
		int no_of_calls;

		Customer c[]=new Customer[n];
		for(int i=0;i<n;i++){
			System.out.println("\n----Customer "+(i+1)+"-----\n");
			System.out.print("\nCustomer ID:");
			cust_id=sc.next();
			System.out.print("\nCustomer Name:");
			cust_name=sc.next();
			System.out.print("\nCustomer Phno:");
			phone_num=sc.nextLong();
			System.out.print("\nCustomer Billno:");
			bill_no=sc.nextLong();
			System.out.print("\nNumber of calls:");
			no_of_calls = sc.nextInt();
			c[i]=new Customer(cust_id,cust_name,phone_num,bill_no,no_of_calls);
			c[i].display();

		}

	}
}