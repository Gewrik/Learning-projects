import java.util.Arrays;
import java.util.Objects;


public class Main {

    public static void main(String[] args) {
        String[] memory = {"object15", null, null, "object2", null, null, null, "object32", null, "object4", null, null, null, ""};
        executeDefragmentation(memory);
        System.out.println(Arrays.toString(memory));

    }

    public static void executeDefragmentation(String[] array) {
        String[] arrayNew = Arrays.copyOf(array, array.length);
        int j = arrayNew.length - 1; //9
        for (int i = array.length - 1 //9
             ; i >= 0; i--) {

            if (array[i] == null) {
                arrayNew[j] = null;
                j--; // j = 8 , i = 8;
            }

        }
        System.out.println(Arrays.toString(arrayNew));

    }

}
