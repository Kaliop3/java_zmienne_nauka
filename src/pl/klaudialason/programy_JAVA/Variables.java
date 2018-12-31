package pl.klaudialason.programy_JAVA;

public class Variables {
    public static void main(String[] args) {
        //Zmiene liczbowe
        byte b = 127;
        byte b1 = -128;
        short s = Short.MAX_VALUE;
        int i = Integer.MAX_VALUE;
        long l = Long.MAX_VALUE;
        Long ll = 23L;

        //Zmienne liczbowe ulamki dziesietne
        float f = Float.MAX_VALUE;
        float f1 = 1.1f;
        double d = Double.MAX_VALUE;
        double d1 = 0.0;

        //Zmienne tekstowe
        char c = 'a';
        String helloWord="Hello, how are you? ";

        //Zmienne logiczne
        boolean boo = true;
        boolean noo1 = false;

        System.out.println(f1);
        System.out.println(c);
        System.out.println(b);
        System.out.println(ll);
    }
}
