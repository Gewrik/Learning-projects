
public class RectangleLetters {
    // Programm that makes a rectangle from a letter of choice.
    public static void main(String[] args) {
        int height = 1;
        String s = "s";
        while (height <= 10) {
            int width = 1;
            while (width <= 20) {
                if (height == 1 || height == 10) {
                    System.out.print(s);
                } else if (width == 1 || width == 20) {
                    System.out.print(s);
                } else {
                    System.out.print(' ');
                }
                width++;
            }
            System.out.println();
            height++;
        }
    }
}