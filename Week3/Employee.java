
//Name:Shreevatsa
//Date Modified:25-05-2021
//Reg No:200970093
import java.util.Scanner;

//class EmpDetails contains details of the employees
class EmpDetails{
	private String empcode;
	    private String ename;
	    private double basic,HRA,PF,net_sal,gross;
	    private int IT;
	    static int empCount=0;
	    public EmpDetails(){
	        empcode=ename=null;
	        basic=HRA=PF=net_sal=gross=0.0;
	        IT=0;
	    }
	    public EmpDetails(String empcode,String ename,double basic){
	        empCount++;
	        this.empcode=empcode;
	        this.ename=ename;
	        this.basic=basic;
	    }
	    public void calculateNetSal(){
	        HRA = basic * 0.075;
	        IT = 200;
	        PF = basic * 0.12;
	        gross = basic + HRA;
	        net_sal = gross - ( IT + PF );
	    }
	    public void displayDetails(){
	        calculateNetSal();
	        System.out.println("\n----------Employee Details ------------");
	        System.out.println("Employee Code: "+empcode);
	        System.out.println("Employee Name: "+ename);
	        System.out.println("Basic Salary: "+basic);
	        System.out.println("HRA: "+HRA);
	        System.out.println("IT: "+IT);
	        System.out.println("PF: "+PF);
	        System.out.println("Gross: "+gross);
	        System.out.println("Net Salary: "+net_sal);


    }
}
public class Employee{


    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of Employees : ");
        int n= sc.nextInt();
        EmpDetails e[]=new EmpDetails[n];
        for(int i=0;i<n;i++){
            System.out.println("\nEnter employee details: ");
            System.out.print("\nEmployee Code: ");
            String empcode=sc.next();
            System.out.print("\nEmployee name: ");
            String ename=sc.next();
            System.out.print("\nBasic Salary: ");
            double bsal=sc.nextDouble();

            e[i] = new EmpDetails(empcode,ename,bsal);
        }
        System.out.println("\n--------Employee details --------");
        System.out.println("\n Total number of Employees: "+EmpDetails.empCount);
        for (int i=0;i<n;i++){
            e[i].displayDetails();
        }

    }
}
