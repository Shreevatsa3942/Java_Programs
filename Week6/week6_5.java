/*
Write a program to copy the contents of one file to another file
using FileReader and FileWriter classes.
*/
//Name:Shreevatsa
//Regno:200970093
import java.io.*;
import java.util.*;

public class week6_5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("\nEnter the source filename: ");
        String src=sc.next();
        System.out.print("\nEnter the destination filename: ");
        String dest=sc.next();

        try {
            FileReader fr=new FileReader(src);
            FileWriter fw=new FileWriter(dest);
            BufferedReader br = new BufferedReader(fr);
            String s;
            while((s=br.readLine()) != null){
                fw.write(s+"\n");
            }
            br.close();
            fw.close();
            System.out.println("\n------File copied------");
            fr=new FileReader(dest);
            br=new BufferedReader(fr);
            System.out.println("\n-----File contents------");
            while((s = br.readLine())!= null)
                System.out.println(s);
            br.close();
        }
        catch (Exception e) {
            System.out.println("Error : "+e);
        }

    }
}
