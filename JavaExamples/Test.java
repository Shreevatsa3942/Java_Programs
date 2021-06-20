
package JavaExamples;

public class Test {
    int x=10;
    static void method1(){
        method2();
    }
    static void method2(){
        System.out.println("All the best");
    }
    public static void main(String args[]){
        Test.method1();
    }
}
