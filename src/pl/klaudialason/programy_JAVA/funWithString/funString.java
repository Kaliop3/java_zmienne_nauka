package pl.klaudialason.programy_JAVA.funWithString;

import pl.klaudialason.programy_JAVA.utils.StrUtils;

public class funString {
    public static void main(String[] args) {
        String text = "a".concat("b");//add a to b
        String text2 = "a" + "b";//add a to b diffrent code

        System.out.println(text);
        System.out.println(text2);

        if (text.equals(text2)) {
            System.out.println("equals");
        }

        System.out.println(text.toUpperCase());
        System.out.println(text2.toLowerCase());

        String s = "a,b,c,d,e,r";
        String[] strings = s.split(","); // change string to array

        System.out.println(strings[2]);

        String result = "";
        for (String str : strings) {
            result += str + ", ";
        }

        System.out.println(StrUtils.removeLastSeparator(result, ","));

        StringBuilder sb = new StringBuilder();//faster get String Words
        for (int i = 0; i < 1000000; i++) {
            sb.append("a");
        }
        System.out.println(sb);

//        String res = "";
//        for (int i = 0; i < 1000000; i++) {
//            res += "a";
//        }
//        System.out.println(res);
        //-----------------------TASK----------------//

        //decode//encode

        String word = "Juz dzis jadlem placki";

        String sel = word.replace("dzis", "jurto");
        System.out.println(sel);

    }
}
