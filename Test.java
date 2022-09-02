import java.util.Scanner;
import java.util.Timer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test {
    public static void main(String[] args) throws InterruptedException {
        String binaryNumber = "100111010000e";
        Pattern pattern = Pattern.compile("\\d+[0-1]");

        Matcher matcher = pattern.matcher(binaryNumber);
        if (matcher.matches()){
            System.out.println("trye");
        }else
        System.out.println("false");
    }

}




