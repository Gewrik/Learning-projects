public class Solution {





    public static void main(String[] args) {
        int decimalNumber = Integer.MAX_VALUE;
        System.out.println("Десятичное число " + decimalNumber + " равно двоичному числу " + toBinary(decimalNumber));
        String binaryNumber = "1111111111111111111111111111111";
        System.out.println("Двоичное число " + binaryNumber + " равно десятичному числу " + toDecimal(binaryNumber));
    }

    public static String toBinary(int decimalNumber) {
        int binary = 0;
        if (decimalNumber <= 0) 
            return null;
        while (decimalNumber != 0)
            binary = (decimalNumber%2) + binary;
            decimalNumber = decimalNumber/2;
            return "0";
        

        /*
        while(десятичное число не равно 0) {
        двоичное представление = остаток от деления десятичного числа на 2 + двоичное представление
        десятичное число = десятичное число / 2
        }
        */
    }
    /*
for (int i = 0; i < длины двоичного представления; i++) {
десятичное число = десятичное число + число из двоичного представления * на 2 в степени i
}
    */
    public static int toDecimal(String binaryNumber) {
        int decimal = 1;
        if (binaryNumber.equals(null) || binaryNumber.equals(" ")|| binaryNumber.equals("")) {
            return 0;
        }else {
            return decimal;
        }
    }








}
