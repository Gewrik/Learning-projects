import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {

    public static void main(String[] args) {
        String binaryNumber = "100111010000";
        System.out.println("Двоичное число " + binaryNumber + " равно шестнадцатеричному числу " + toHex(binaryNumber));
        String hexNumber = "8c0";
        System.out.println("Шестнадцатеричное число " + hexNumber + " равно двоичному числу " + toBinary(hexNumber));
    }

    public static String toHex(String binaryNumber) {
        String binaryNumberTemp = "";
        String hexNumber = "";
//        Check for null or empty string
        if (binaryNumber == null || binaryNumber.equals(""))
            return "";

        Pattern pattern = Pattern.compile("([01])*");
        Matcher matcher = pattern.matcher(binaryNumber);
        if (!matcher.matches()) {
            return "";
        }
//        Check for binaryNumber to be divided by 4
//        if not - add 0
        while (binaryNumber.length() % 4 != 0) {
            binaryNumber = binaryNumber + "0";
        }

        do {
            for (int i = 0; i < binaryNumber.length() + 1; i++) {

                if ((i % 4 == 0) && i != 0) {
                    switch (binaryNumberTemp) {
                        case "0000":
                            hexNumber += "0";
                            break;
                        case "0001":
                            hexNumber += "1";
                            break;
                        case "0010":
                            hexNumber += "2";
                            break;
                        case "0011":
                            hexNumber += "3";
                            break;
                        case "0100":
                            hexNumber += "4";
                            break;
                        case "0101":
                            hexNumber += "5";
                            break;
                        case "0110":
                            hexNumber += "6";
                            break;
                        case "0111":
                            hexNumber += "7";
                            break;
                        case "1000":
                            hexNumber += "8";
                            break;
                        case "1001":
                            hexNumber += "9";
                            break;
                        case "1010":
                            hexNumber += "a";
                            break;
                        case "1011":
                            hexNumber += "b";
                            break;
                        case "1100":
                            hexNumber += "c";
                            break;
                        case "1101":
                            hexNumber += "d";
                            break;
                        case "1110":
                            hexNumber += "e";
                            break;
                        case "1111":
                            hexNumber += "f";
                            break;

                    }

                    binaryNumberTemp = "";
                }
                try {
                    binaryNumberTemp += (binaryNumber.charAt(i));
                } catch (Exception e) {
                }
            }
        } while (binaryNumber.length() / 4 != hexNumber.length() && binaryNumberTemp.length() / 4 == 1);

        return hexNumber;

    }

    public static String toBinary(String hexNumber) {
        String binaryNumber = "";
        String hexNumberTemp = "";

        //        Check for null or empty string
        if (hexNumber == null || hexNumber.equals(""))
            return "";
        Pattern pattern = Pattern.compile("^([a-f0-9]{1,6})$");
        Matcher matcher = pattern.matcher(hexNumber);
        if (!matcher.matches()) {
            return "";
        }
//        Convert method
        try {
            do {
                for (int i = 0; i < hexNumber.length() + 1; i++) {


                    switch (hexNumberTemp) {
                        case "0":
                            binaryNumber += "0000";
                            break;
                        case "1":
                            binaryNumber += "0001";
                            break;
                        case "2":
                            binaryNumber += "0010";
                            break;
                        case "3":
                            binaryNumber += "0011";
                            break;
                        case "4":
                            binaryNumber += "0100";
                            break;
                        case "5":
                            binaryNumber += "0101";
                            break;
                        case "6":
                            binaryNumber += "0110";
                            break;
                        case "7":
                            binaryNumber += "0111";
                            break;
                        case "8":
                            binaryNumber += "1000";
                            break;
                        case "9":
                            binaryNumber += "1001";
                            break;
                        case "a":
                            binaryNumber += "1010";
                            break;
                        case "b":
                            binaryNumber += "1011";
                            break;
                        case "c":
                            binaryNumber += "1100";
                            break;
                        case "d":
                            binaryNumber += "1101";
                            break;
                        case "e":
                            binaryNumber += "1110";
                            break;
                        case "f":
                            binaryNumber += "1111";
                            break;

                    }

                    hexNumberTemp = "";

                    try {
                        hexNumberTemp += (hexNumber.charAt(i));
                    } catch (Exception e) {
                    }
                }
            } while (hexNumber.length() / 4 != binaryNumber.length() && hexNumberTemp.length() / 4 == 1);
        } catch (Exception e) {
            return "";
        }

        return binaryNumber;
    }
}