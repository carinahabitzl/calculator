public class NewCalculator {
    public static void main(String[] args) {


        printResult(2 + 3);
        int tt = 2 + 4;
        printResult(tt);

        int result = add(2, 5);
        printResult(result);
        printResult(add(2, 6));
    }

    public static void printResult(int result) {
        System.out.println(result);
    }

    public static int add(int a, int b) {
        return a + b;
    }
}
