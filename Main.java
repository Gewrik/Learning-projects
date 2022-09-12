import java.util.Arrays;
import java.util.Objects;


public class Main {

    public static void main(String[] args) {
        String[] memory = {"object15", null, null, "object2", null, null, null, "object32", null, "object4"};
        executeDefragmentation(memory);
        System.out.println(Arrays.toString(memory));
        System.out.println(memory.length);

    }

    public static void executeDefragmentation(String[] array) {
        String[] newArray = Arrays.copyOf(array, array.length);
        int j = 0;
        for (int i = 1; i < array.length + 1; i++) {
           if (array[i] == null) {
                newArray[array.length - i] = null;
                j++;
            } else if (array[i] != null){
               newArray[i - 1] = array[i];
            }
        }
        System.out.println("newArray:" + Arrays.toString(newArray));

    }

}
