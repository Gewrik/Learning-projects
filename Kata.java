public class Kata {
    public static void main(String[] args) {
        String n = "Indivisibilities";
        System.out.println(duplicateCount(n));
    }

    public static int duplicateCount(String text) {
        text = text.toLowerCase();
        int duplCount = 0;
        for (int out = text.length() - 1; out >= 1 ; out--) {
            for (int in = 0; in < out; in++) {
                char ins = text.charAt(in);
                char outs = text.charAt(out);
                if (ins == outs){
                    duplCount += 1;
                    break;
                }
            }
        }
        return duplCount;
        }

}