public class calculator {

    public static void main(String[] args) {

    int a = 1;
    double b = 345.9;
    boolean c = false;
    char d = 'c';
    String e = "Hallo";

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);

        boolean even = 2%2 == 0;
        System.out.println(even);

        printResult(2 + 3);
        int tt = 2 + 4;
        printResult(tt);

        int result = add(2, 5);
        printResult(result);
        printResult(add(2, 6));

        printNewResult(2 + 3);

        int result2 = formadd(2,3);
        printNewResult(result2);

        int result3 = formsub (6, 3);
        printNewResult(result3);

        int result4 = formmult (4, 8);
        printNewResult(result4);

        printNewResult(formdiv(6, 2));

        printNewResult(formmod(9, 4));

        printNewResult(divide(7, 3));


    }
    public static void printResult(int result) {
        System.out.println(result);
    }

    public static int add(int a, int b) {
        return a + b;
    }

    public static int formadd(int a, int b) {
        return a + b;
    }
    public static int formsub(int a, int b) {
        return b - a;
    }
    public static int formmult(int a, int b) {
        return a * b;
    }
    public static int formdiv(int a, int b) {
        return a / b;
    }
    public static int formmod(int a, int b) {
        return a % b;
    }

    public static void printNewResult(int newResult) {
        System.out.println(newResult);
    }

    public static int divide(int dividend, int divisor) {

        //if (divisor == 0) {
        //return 0;
        // }
        if (divisor != 0) {
            return dividend / divisor;
        }
        return 0;

    }


}
