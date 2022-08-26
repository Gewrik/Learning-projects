package Finished;

public class HexToDecimal {
    private static final String HEX = "0123456789abcdef";

    public static void main(String[] args) {
        int decimalNumber = 1256;
        System.out.println("Десятичное число " + decimalNumber + " равно шестнадцатеричному числу " + toHex(decimalNumber));
        String hexNumber = "4e8";
        System.out.println("Шестнадцатеричное число " + hexNumber + " равно десятичному числу " + toDecimal(hexNumber));
    }


    public static String toHex(int decimalNumber) {
        if (decimalNumber <= 0)
            return "";
        String hex = "";
        while (decimalNumber != 0) {
            hex = HEX.charAt(decimalNumber % 16) + hex;
            decimalNumber = decimalNumber / 16;
        }
        return hex;
    }


    public static int toDecimal(String hexNumber) {
        int decimal = 0;
        if ((hexNumber == null) || (hexNumber.equals("")) || (hexNumber.equals(" ")))
            return 0;

        for (int i = 0; i < hexNumber.length(); i++) {
            int a = HEX.indexOf(hexNumber.charAt(i), 0);
            decimal = 16 * decimal + a;
        }
        return decimal;
//


    }
}

