import java.util.Scanner;




public class test {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int start = scanner.nextInt();
        int end = scanner.nextInt();
        int multiple = scanner.nextInt();
        scanner.close();
        int sum = start+end+multiple;
        

        System.out.println(sum);
    }         
}
