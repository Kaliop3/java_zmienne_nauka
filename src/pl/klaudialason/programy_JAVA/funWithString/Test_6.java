package pl.klaudialason.programy_JAVA.funWithString;


public class Test_6 {
    public static void main(String[] args) {
        String tens = "Malutki Jacek jadal duzo batonow";
        String encode = Crypto.encode(tens);
        System.out.println(encode);

    }

}
