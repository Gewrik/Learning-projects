import java.util.Scanner;
import java.util.Timer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test {
    public static void main(String[] args) throws InterruptedException {
        Scanner console = new Scanner(System.in);
        String path = console.nextLine();

        if (path.endsWith(".jpg") || path.endsWith(".jpeg"))
        {
            System.out.println("Это Jpeg!");
        }
        else if (path.endsWith(".htm") || path.endsWith(".html"))
        {
            System.out.println("Это HTML-страница");
        }
        else if (path.endsWith(".doc") || path.endsWith(".docx"))
        {
            System.out.println("Это документ Word");
        }
        else
        {
            System.out.println("Неизвестный формат");
        }

    }

}




