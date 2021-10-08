public class ArithmetischeOperationen {

    public static void main(String[] args) {
        int a = 8;
        int b = 10;

        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a % b);
        System.out.println(a * b);
        System.out.println(a / b);

        printResult(a);

        int result = add(a,b);
        printResult(result);
    }

    public static void printResult(int result) {
        System.out.println(result);
    }

    public static int add(int a, int b) {
        return a + b;
    }
}
