import java.util.Arrays;
import java.util.Objects;


public class Main {

    public static void main(String[] args) {
        String[] memory = {"object15", null, null, "object2", "object3", null, null, "object32", null, "object4", null, null, null, "object5"};
        executeDefragmentation(memory);
        System.out.println(Arrays.toString(memory));

    }

    public static void executeDefragmentation(String[] array) {



        System.out.println("*********0 cycle***********");
        System.out.println("***************************");
        System.out.println();
        System.out.print("array:");
        System.out.println(Arrays.toString(array));
        System.out.println();

        String[] arrayNew = Arrays.copyOf(array, array.length);
        int j = arrayNew.length - 1;
        for (int i = array.length - 1; i >= 0; i--) {
            if (array[i] == null) {
                arrayNew[j] = null;
                j--;
            }
        }
        j = 0;

        System.out.println("*********1 cycle***********");
        System.out.print("arrayNew:");
        System.out.println(Arrays.toString(arrayNew));
        System.out.println();
        System.out.println("***************************");
        System.out.println();
        System.out.print("array:");
        System.out.println(Arrays.toString(array));



        for (int i = 0; i < array.length; i++) {
            if (array[i] != null) {
                arrayNew[i] = array[j];
                j++;
            }
        }
        System.out.println("*********2 cycle***********");
        System.out.print("arrayNew:");
        System.out.println(Arrays.toString(arrayNew));
        System.out.println();
        System.out.println("***************************");
        System.out.println();
        System.out.print("array:");
        System.out.println(Arrays.toString(array));

    }

}
