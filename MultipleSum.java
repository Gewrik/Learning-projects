
import java.util.Scanner;

/* 
Programm that reads 3 numbers from User - start, end and multiple - and checks if 
any numbers between Start (inclusive) and End (not inclusive) are multiple of number 
Multiple, and then finds their total sum
*/


public class MultipleSum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int start = scanner.nextInt();
        int end = scanner.nextInt();
        int multiple = scanner.nextInt();
        scanner.close();
        int sum = 0;
        for (int i = start; i < (end - 1); i++) {
            if (i%multiple != 0) continue; {
                sum += i;
                
            }   
        }
        System.out.println(sum);

    }         
}
