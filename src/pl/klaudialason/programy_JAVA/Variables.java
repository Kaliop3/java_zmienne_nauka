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
        String helloWord = "Hello, how are you? ";

        //Zmienne logiczne
        boolean boo = true;
        boolean noo1 = false;

        System.out.println(f1);
        System.out.println(c);
        System.out.println(b);
        System.out.println(ll);
        //---------------------------------------------

        int x = 10;
        int x1 = 20;
        int x2 = 30;
        int x3 = 40;

        System.out.println("-----------------------------------------");
        x1 += 4; // alt + ctrl + l
        x2 /= 2;
        x3 *= 2;
        System.out.println(x++);
        System.out.println(x1);
        System.out.println(x2);
        System.out.println(x3);
        //--------------------const-----------------------//

        final int X5 = 10;
        int z6;
        z6 = 87;

        System.out.println(X5);

        //------------------var----------------//

        var e = 23;
        var sa = 0.9;
        var ds ="p";
        var de =" Hej ";

    }
}
