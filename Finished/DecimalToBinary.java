package Finished;

public class DecimalToBinary {


    public static void main(String[] args) {
        int decimalNumber = 256;
        System.out.println("Десятичное число " + decimalNumber + " равно двоичному числу " + toBinary(decimalNumber));
        String binaryNumber = "11011011100";
        System.out.println("Двоичное число " + binaryNumber + " равно десятичному числу " + toDecimal(binaryNumber));
    }

    public static String toBinary(int decimalNumber) {
        String binary = "";
        if (decimalNumber <= 0) {
            return "";
        } else {
            while (decimalNumber != 0) {
                binary = binary + decimalNumber%2;
                decimalNumber = decimalNumber/2;
            }
            binary = new StringBuilder(binary).reverse().toString();
            return binary;
        }


        /*

         */
    }

    public static int toDecimal(String binaryNumber) {
        if ((binaryNumber == null) || (binaryNumber.equals(" ")) || (binaryNumber.equals(""))) {
            return 0;
        } else {
            double convertedDouble = 0;

            for (int i = 0; i < binaryNumber.length(); i++) {
                if (binaryNumber.charAt(i) == '1') {
                    int len = binaryNumber.length() - i - 1;
                    convertedDouble += Math.pow(2, len);
                }
            }

            int convertedInt = (int) convertedDouble;
            return convertedInt;
        }

    }


}

