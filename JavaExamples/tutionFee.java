package JavaExamples;

public class tutionFee {
    public static void main(String args[]){
        double total=50000;
        double fee=0;
        for(int i=1;i<=10;i++)
        {
            fee=(5000*5*i)/100;
            total=total+fee;

            System.out.println("The fee after "+i+" year = "+total);
        }
    }
}
