/*Program to find the volume of a box */
//Name:Shreevatsa
//Reg No:200970093

import java.util.Scanner;

class VolumeBox{

	double height,width,depth;
	VolumeBox(double height,double width,double depth)
	{
		this.height=height;
		this.width=width;
		this.depth=depth;
	}
	double volume()
	{
		return height * width * depth;
	}

}

public class Box
{

	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter the Height of box:");
		double height=sc.nextDouble();

		System.out.println("Enter the Width of box:");
		double width=sc.nextDouble();

		System.out.println("Enter the Depth of box:");
		double depth=sc.nextDouble();

		VolumeBox vol=new VolumeBox(height,width,depth);

		System.out.println("The Volume of the Box is : " +vol.volume());
	}
}