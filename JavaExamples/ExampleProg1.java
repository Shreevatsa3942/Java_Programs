
package JavaExamples;
class Point{
    final int MAX;
    static int noOfPoints;
    static int x,y;
    
    public Point(int x,int y){
        MAX=5;
        incre();
        this.x=x;
        this.y=y;
    }
    static void incre(){
        noOfPoints++;
    }
    public void display(){
        System.out.println("MAX: "+MAX);
        System.out.println("Point X: "+x);
        System.out.println("Point Y: "+y);
    }
}

public class ExampleProg1 {
    public static void main(String args[]){
        System.out.println("No. of Points: "+Point.noOfPoints);
        Point p1=new Point(10,20);
        
        System.out.println("No. of Points: "+p1.noOfPoints);
        Point p2= new Point(11,22);
        p1.display();
        p2.display();
        System.out.println("No. of Points: "+p1.noOfPoints);
    }
}
