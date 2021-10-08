import java.util.Arrays;

public class Calculator {

    public static void main(String[] args)
    {
        int a = 5;
        int aa = 2;
        double b = 20;
        boolean c = true;
        char d = '-';
        String e = "abc";

        //Gerade
        boolean even = 2 % 2 == 0;
        System.out.println(even);

        System.out.println("Methods:");
        printResult(Add(a,aa));
        printResult(Sub(a,aa));
        printResult(Multi(a,aa));
        printResult(Div(a,aa));
        }

    public static int Add(int a,int b) {
        return(a + b);
    }

    public static int Sub(int a,int b) {
        return(a - b);
    }

    public static int Multi(int a,int b) {
        return (a * b);
    }

    public static int Div(int a,int b) {
        return(a / b);
    }

    public static void printResult(int result) {
        System.out.println(result);
    }
    }
