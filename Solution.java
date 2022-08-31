public class Solution {

    public static void main(String[] args) {
        String binaryNumber = "100111010000";
        System.out.println("Двоичное число " + binaryNumber + " равно шестнадцатеричному числу " + toHex(binaryNumber));
        String hexNumber = "9d0";
        String decimalNumber = "157";
        System.out.println("Шестнадцатеричное число " + hexNumber + " равно двоичному числу " + toBinary(hexNumber));
    }

    /*Берем каждые четыре символа (бита) и проверяем, какому символу шестнадцатеричной кодировки он соответствует.
    Например:

    двоичное представление — "100111010000",
        где "1001" — "9", "1101" — "d", "0000" — "0",
    шестнадцатеричное представление — "9d0".*/
    public static String toHex(String binaryNumber) {
        String binaryNumberTemp = "";
        String hexNumber = "";
        String s;

//        Check for null or empty string
        if (binaryNumber == null || binaryNumber.equals(""))
            return "";

//        Check for binaryNumber to be divided by 4
//        if not - add 0
        while (binaryNumber.length() % 4 != 0) {
            binaryNumber = binaryNumber + "0";
        }
//        binaryNumber.length()/4 != hexNumber.length()
        do {
            for (int i = 0; i < binaryNumber.length(); i++) {

                if ((i % 4 == 0) && i != 0) {


                    binaryNumberTemp = "";
                }
                binaryNumberTemp += (binaryNumber.charAt(i));


            }



        } ;


        return hexNumber;
    }

    public static String toBinary(String hexNumber) {
        //напишите тут ваш код
        return null;
    }
}