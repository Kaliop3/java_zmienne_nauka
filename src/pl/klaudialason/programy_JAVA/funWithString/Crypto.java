package pl.klaudialason.programy_JAVA.funWithString;

public class Crypto {
    public static String encode(String str) {
        char[] arr = str.toCharArray();
        StringBuilder sb = new StringBuilder();
        for (char a : arr) {
            sb.append(a);
        }
        return sb.toString();
    }

}
