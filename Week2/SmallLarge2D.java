/*
Write a java program to find the largest and smallest element in a two-dimensional array. 
Display the row & column indices of the largest and 
the smallest element in the given twodimensional array.
 */
//Name:Shreevatsa
//Reg no:200970093

package javaprogramming;
import java.util.Scanner;
public class SmallLarge2D {
  public static void main(String args[]){
      Scanner sc=new Scanner(System.in);
      System.out.print("Enter the number of rows and columns of the array: ");
      int row=sc.nextInt();
      int col=sc.nextInt();
      System.out.println("\nEnter the Array:");
      float a[][]=new float[row][col];
      for(int i=0;i<row;i++){
          for(int j=0;j<col;j++){
              a[i][j]=sc.nextFloat();
          }
      }
      int SlocX=0,SlocY=0,LlocX=0,LlocY=0;
      float small=a[0][0],large=a[0][0];
      //searching small and large in array a
      for(int i=0;i<row;i++){
          for(int j=0;j<col;j++){
              if(large < a[i][j]){
                 large=a[i][j];
                 LlocX=i;
                 LlocY=j;
              }
              
                  
              if(small > a[i][j]){
                  small=a[i][j];
                  SlocX=i;
                  SlocY=j;
              }
              
                  
          }
      }
      System.out.print("\nThe Largest Element: "+large+" , Location: ("+LlocX+", "+LlocY+")");
      System.out.print("\nThe Smallest Element: "+small+" , Location: ("+SlocX+", "+SlocY+")\n\n");
      
  }  
}
