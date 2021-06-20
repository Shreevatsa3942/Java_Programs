/*Create a file containing a set of strings. Read the file, sort the
strings and store them in another file*/
//Name:Shreevatsa
//Regno:200970093
import java.io.*;
import java.util.*;
public class week6_4 {
    public static void main(String[] args) throws Exception {

		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the name of source file: ");
		String source=sc.next();
		//"StringNames.txt"
		System.out.print("Enter the name of Destination file: ");
		String destin=sc.next();

        File file1 = new File(source);
        BufferedReader bf=new BufferedReader(new FileReader(file1));
        //array list to store n number of array of strings
        List<String> list = new ArrayList<String>();
        String data;
        while(( data = bf.readLine())!= null){
			//removing space from start and end of a string
			data=data.trim();
			//if there are multiple space inbetween string then reducing it to single space
			data=data.replaceAll("( )+", " ");
			String[] tmp = data.split(" ");  //split strings based on space
			for(String s: tmp){
				list.add(s); //adding splitted string into an array of list
			}
        }
        //converting list into array of string objects
        String str[]=list.toArray(new String[list.size()]);

		System.out.print("\n-----File Contents-----\n");
        for(String s1:str){
            System.out.println(s1);
        }
        //sort the string
        int size=str.length;
        String s1,s2,temp;
        for(int i=0;i<size;i++){
            s1=str[i];
            for(int j=i+1;j<size;j++){
                s2=str[j];
                if(s1.compareTo(s2)>0){
                    temp=s1;
                    s1=s2;
                    s2=temp;
                    str[i]=s1;
                    str[j]=s2;
                }
            }
        }
        //Arrays.sort(str);
        System.out.println("-----Sort-------");
        for(String ex:str){
            System.out.println(ex);
        }

        bf.close();
        //store the sorted string in another file
        File file2=new File("output.txt");
        BufferedWriter bw=new BufferedWriter(new FileWriter(file2));
        for(String ex:str){
            bw.write(ex+"\n");
        }
        bw.close();
        //print contents of the file
        FileReader file=new FileReader(destin);
        BufferedReader br=new BufferedReader(file);

        System.out.println("\n-----Sorted Names in the file-------");
        while(( data = br.readLine())!= null){
      		System.out.println(data);
	 	}

    }
}