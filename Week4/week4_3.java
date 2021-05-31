/*
Create a class called Stack with necessary fields and constructors. Use static methods for
push and pop operations
*/

import java.util.Scanner;
class stack{
	private static int arr[];
	private static int top,size;

	public stack(int size){
		this.size=size;
		arr = new int[size];
		top=-1;
	}

	public static void push(int var){

		if(top >= size-1)
			System.out.print("\nStack is full");
		else{
			top++;
			arr[top]=var;
			System.out.print("\nElement " +var+" pushed to the stack");
		}
	}

	public static void pop(){
		if(top == -1)
			System.out.print("\nStack is Empty! ");
		else{

			System.out.print("\n "+arr[top]+" popped successfully");
			top--;
		}
	}
	public static void display(){
		System.out.print("\n\n----Stack----\n");
		for(int i=0;i<=top;i++)
		System.out.print(" "+arr[i]);

		System.out.print("\n");
	}
}
class week4_3{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.print("\nEnter the Size of the stack: ");
		int n=sc.nextInt();
		stack s=new stack(n);
		int ele,ch;
		do{
			System.out.print("\n1.Push\n2.Pop\n3.Display\n4.Exit\nEnter your choice:");
			ch=sc.nextInt();
			switch(ch){
			case 1:
					System.out.print("\nEnter an integer value: ");
					ele=sc.nextInt();
					stack.push(ele);
					break;
			case 2:
					stack.pop();
					break;
			case 3:
					stack.display();
					break;
			case 4:
					System.exit(0);
					break;

			default: System.out.print("\nInvalid choice: ");
			}

		}while(true);

		//System.out.print("\n");
	}
}
