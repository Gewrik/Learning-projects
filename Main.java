import java.util.Arrays;
import java.util.Objects;


public class Main {

    public static void main(String[] args) {
        String[] memory = {"object15", null, null, "object2", null, null, null, "object32", null, "object4"};
        executeDefragmentation(memory);
        System.out.println(Arrays.toString(memory));


    }

    public static void executeDefragmentation(String[] array) {

        for (int out = array.length - 1; out >= 1; out--) {
            for (int in = 0; in < out; in++) {
                if (array[in] > array[in + 1])
            }
        }
    }
}



