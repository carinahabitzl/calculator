public class ArrayDemo1 {
    public static void main(String[] args) {


        int[] array1 = {7, 3, 1};
        int[] array2 = {1, 2, 3};

        System.out.print("+, ");
        for (int i = 0; i < array1.length; i++) {

            System.out.print(array1[i] + array2[i] + ", ");
        }
        System.out.println();
        System.out.print("*, ");
        for (int i = 0; i < array1.length; i++) {

            System.out.print(array1[i] * array2[i] + ", ");
        }
    }
}
