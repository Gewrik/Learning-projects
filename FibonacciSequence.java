import java.util.Scanner;

public class FibonacciSequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter index of desirable number from Fibonacci sequence:");
        int x = scanner.nextInt();
        System.out.println("Your Fibonacci number is: " + getFibonacciByIndex(x));
    }

    public static long getFibonacciByIndex(int index) {

        if (index == 0) {
            return 0;
        }
        if ((index < 0) || index > 92) {
            throw new IndexOutOfBoundsException();
        }

        var n0 = 0;
        var n1 = 1;
        for (var i = 2; i < index; i++) {
            var n2 = n0 + n1;
            n0 = n1;
            n1 = n2;
        }
        return n1;
    }
}
