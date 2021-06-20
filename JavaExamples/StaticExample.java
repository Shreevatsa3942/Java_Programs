
package JavaExamples;

class EMP{
    static String CEO;
    int eid;
    int salary;
    void display(){
        System.out.println("CEO : "+CEO);
        System.out.println("EID : "+eid);
        System.out.println("Salary : "+salary);
        
    }
}
public class StaticExample {
    public static void main(String[] args) {
        EMP.CEO="Ram";
        EMP vatsa=new EMP();
        //vatsa.CEO="Mahesh";
        vatsa.eid=101;
        vatsa.salary=100000;
        EMP groot=new EMP();
        groot.CEO="Raghu";
        groot.eid=101;
        groot.salary=100000;
        
        System.out.println("Employee Vatsa: ");
        vatsa.display();
        
        System.out.println("Employee Groot: ");
        groot.display();        
    }
}
