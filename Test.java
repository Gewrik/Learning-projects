import java.util.StringTokenizer;

public class Test {
    public static void main(String[] args) {


        String s = String.format("a=%4$d, a=%3$d, x=%2$d, b=%2$d, c=%d", 11, 12, 13, 14);
        System.out.println(s);

    }
}
