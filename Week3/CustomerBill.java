/*
A shop provides discount to customers based on their total bill amount as follows:
Total bill amount Discount
            <500 No discount
            500-1000 10%
            1000-2000 12%
            Above 2000 15%
Create a class called Shop with data members for storing item id, item name, quantity, unit
price and total bill amount. Implement the above using a menu-driven program.
*/

//Name:Shreevatsa
//Date Modified:08-04-2021
//Reg No:200970093

import java.util.Scanner;

class shop{
    String item_id,item_name;
    int qty;
    double unit_price,bill=0,discount=0;

    //parameterized constructor
    public shop(String id, String it_name, int it_qty, double price){

        item_id=id;
        item_name=it_name;
        qty=it_qty;
        unit_price=price;
    }

    public double bill_calculate(){
        bill=qty*unit_price;
        if(bill<500)
            discount=0;
        else if(bill <= 1000)
            discount=bill*0.1;
        else if(bill <= 2000)
            discount=bill*0.12;
        else if(bill > 2000)
            discount=bill*0.15;

        bill=bill-discount;
        return bill;

    }
}


public class CustomerBill {
    String cname;
    int n;
    double total_bill=0;


    //creating a method input() to insertion
    public void input(){
      Scanner sc=new Scanner(System.in);
      System.out.print("Enter the name of the customer : ");
        cname=sc.next();
        System.out.print("\nEnter the number of items : ");
        n=sc.nextInt();
        String id,itname;
        int qty;
        double unit_price;
        shop[] s=new shop[n];
        for(int i=0;i<n;i++){
            System.out.println("Enter the details of the item: ");
            System.out.print("Item ID : ");
            id=sc.next();
            System.out.print("Item Name : ");
            itname=sc.next();
            System.out.print("Item Quantity : ");
            qty=sc.nextInt();
            System.out.print("Price per Unit : ");
            unit_price=sc.nextDouble();
            s[i]=new shop(id,itname,qty,unit_price);
            total_bill+=s[i].bill_calculate();
        }
        display(s);
    }
    public void display(shop s[]){

        System.out.println("-------------Bill--------------");
        System.out.println("\nItem_ID\tItem_name\tItem_qty\tUnit_Price\tBill");
        System.out.println("-------\t---------\t--------\t----------\t-----");
        for(int i=0;i<n;i++){
            System.out.println(s[i].item_id+"\t"+s[i].item_name+"\t"+s[i].qty+"\t"+s[i].unit_price+"\t"+s[i].bill_calculate());
        }
        System.out.println("------------------------------");
        System.out.println("Total Bill: "+total_bill);
    }


    //main method
    public static void main(String args[]){

        CustomerBill cust=new CustomerBill();
        cust.input();
   }
}