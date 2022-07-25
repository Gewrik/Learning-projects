import java.util.Arrays;

public class ReversedArray {


    public static void main(String[] args) {
        int[] array = {11, 22, 33, 44, 55, 66, 77, 88, 99};
        printArray(array);
        reverseArray(array);
        printArray(array);
    }

    public static void reverseArray(int[] array) {
        int[] arrayTemp = Arrays.copyOf(array, array.length);
        for (int i = 0; i < array.length; i++) {
            array[i] = arrayTemp[array.length - i - 1];
        }
    }

    public static void printArray(int[] array) {
        for (int i : array) {
            System.out.print(i + ", ");
        }
        System.out.println();
    }
}



