//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.util.Scanner;

public class Reverse {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] arrayN = new int[N];
        if (N > 0) {
            int j;
            for(j = 0; j < N; ++j) {
                arrayN[j] = scanner.nextInt();
            }

            if (N % 2 == 0) {
                for(j = 0; j < N; ++j) {
                    System.out.println(arrayN[j]);
                }
            } else {
                for(j = N - 1; j >= 0; --j) {
                    System.out.println(arrayN[j]);
                }
            }
        }

    }
}
