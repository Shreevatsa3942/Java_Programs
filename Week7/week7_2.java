
import java.util.Scanner;

/*
 Write a program to read two 1-D arrays of numbers, and perform element-wise 
division on these arrays. 
Handle arithmetic exception & array index out of bound exception.
*/
//Name:Shreevatsa
//Regno:200970093
public class week7_2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size1,size2;
        System.out.print("\nEnter the size for Array1: ");
        size1=sc.nextInt();
        System.out.print("\nEnter the size for Array2: ");
        size2=sc.nextInt();
        
        int arr1[] = new int[size1];
        int arr2[] = new int[size2];
        
        System.out.println("\nEnter the elements for Array1: ");
        for(int i=0;i<size1;i++){
            arr1[i]=sc.nextInt();
        }
        System.out.println("\nEnter the elements for Array2: ");
        for(int i=0;i<size2;i++){
            arr2[i]=sc.nextInt();
        }
        
        try {
            int size;
            if(size1 > size2)
                size=size1;
            else
                size=size2;
            System.out.println("Result  : ");
            for(int i=0;i<size;i++){
                System.out.println(arr1[i]+" / "+arr2[i]+" = "+(arr1[i]/arr2[i]));
            }
        } 
        catch (ArithmeticException e) {
            System.out.println(e);
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }
    }
}
