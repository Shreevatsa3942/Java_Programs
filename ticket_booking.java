/*
Write a java program to book multiplex tickets. Assume that there are 5 ticket categories, 
in each category there are 20 tickets. User inputs- Name, Phoneno, 
Ticket category and Number of tickets.
Depending on users input, decrement the number of seats in corresponding category.
 */
//Name:Shreevatsa
//Reg Number:200970093
package javaprogramming;

import java.util.Scanner;

class multiplex{
    Scanner sc=new Scanner(System.in);
    //user details 
    private String name;
    private long phno;
    private int  num_tickets;
    private int ticket_catogory;
    
    //details for multiplex
    static int catogory[]=new int[5];
    static int count=0;
    static void MAX_TICKETS(){
        for(int i=0;i<5;i++)
            catogory[i]=20;
    }
    public multiplex(String name,long phno,int num_tickets,int ticket_catogory){
        count++;
        this.name=name;
        this.phno=phno;
        this.num_tickets=num_tickets;
        this.ticket_catogory=ticket_catogory;
        calculate();
    }
    public void calculate(){
        if(catogory[ticket_catogory-1]-num_tickets >= 0){
            catogory[ticket_catogory-1]-=num_tickets;
        }
        else
        {
            this.num_tickets=0;
            System.out.println("This Catogory is Full or Number of tickets are invalid!! Please Choose other catogory");
            System.out.println("Ticket Catogory :");
            this.ticket_catogory=sc.nextInt();
            System.out.println("Number of tickets :");
            this.num_tickets=sc.nextInt();
            calculate();
        }
        
                    
    }
    public void display(){
        System.out.println("\n-------------------------------------------");
        System.out.println("Customer name :"+name);
        System.out.println("Phone number :"+phno);
        System.out.println("Ticket Catogory :"+(ticket_catogory+1));
        System.out.println("Number of tickets :"+num_tickets);
        System.out.println("\n-------------------------------------------");
        
    }
    
}
public class ticket_booking {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        //Assingning Maximum number of seats 
        multiplex.MAX_TICKETS();
        multiplex m[]=new multiplex[100];
        start:while(true){
        
        //Displaying the number of tickets
        System.out.println("------Multiplex-------");
        System.out.println("Number of Bookings : "+multiplex.count);
        System.out.println("------Tickets Available------");
        for(int i=0;i<5;i++){
            System.out.println("Catogory - "+(i+1)+" :"+multiplex.catogory[i]);
        }
        System.out.println("\n\n-----BOOKINGS------");
        System.out.println("\n1.Book Tickets");
        System.out.println("\n2.Display Details");
        System.out.println("\n3.Exit");
        System.out.print("\nEnter your choice :");
        int ch=sc.nextInt();
        switch(ch){
            case 1:
                System.out.println("Customer name :");
                String name=sc.next();
                System.out.println("Phone number :");
                long phno=sc.nextLong();
                System.out.println("Ticket Catogory :");
                int ticket_catogory=sc.nextInt();
                System.out.println("Number of tickets :");
                int  num_tickets=sc.nextInt();
                
                
                m[multiplex.count]=new multiplex(name,phno,num_tickets,ticket_catogory);
                break;
                
            case 2:
                
                try{
                    System.out.println("---------Booking Details----------\n");
                for(int i=0;i<=multiplex.count;i++)
                {
                    m[i].display();
                }
                }
                catch(Exception e){
                    System.out.println("\n-------------------------------------------");
                    System.out.println("There is no Bookings yet!!");
                    System.out.println("\n-------------------------------------------");
                    continue start;
                }
                break;
                
                
            case 3:System.exit(0);
            
            
            default:System.out.println("Invalid choice:");
        }
        }
        
        
    }
    
}
