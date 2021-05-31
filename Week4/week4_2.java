/*
Consider a class called Points with x-coordinate and y-coordinate as its data members.
Create three objects P1, P2 and P3, which represent three points in a plane.
• Calculate and the distance between P1 and P2 (by passing the coordinates of one point
as arguments).
• Calculate and the distance between P1 and P3 (by passing one point itself as argument).
Note: The distance between two points P(x1, y1) and Q(x2, y2) is calculated as:
??(??,??) = v(??2 - ??1)^2+ (??2 - ??1)^2\

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
	public int getX(){
		return x;
	}
	public int getY(){
		return y;
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
	public double distance(int x2,int y2){

			System.out.print("\nX1 : "+this.x+" X2: "+x2);
			System.out.print("\nY1 : "+this.y+" Y2: "+y2);
			double expr=((x2 - this.x)*(x2 - this.x))+((y2 - this.y)*(y2 - this.y));
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

		int x=p2.getX();
		int y=p2.getY();
		result=p1.distance(x,y);
		System.out.println("\nDistance between p1 and p2 = "+result);
		result=p1.distance(p3);
		System.out.println("\nDistance between p1 and p3 = "+result);

		System.out.println("\n");

	}
}