package pl.programowanie.java.helion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class zadanie21 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a, b, c;
        System.out.println("Podaj bok a: ");
        a = Integer.parseInt(br.readLine());
        System.out.println("Podaj bok b: ");
        b = Integer.parseInt(br.readLine());
        System.out.println("Podaj bok c: ");
        c = Integer.parseInt(br.readLine());

        System.out.println("Boki "+a+" "+b+" "+c);

        if((a*a+b*b)==c*c){
            System.out.println("tworza trojkat prostokatny");
        }
        else{
            System.out.println("nie tworzą trojkat prostokatnego");
        }

    }
}
