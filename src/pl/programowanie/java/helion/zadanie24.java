package pl.programowanie.java.helion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class zadanie24 {
    public static void main(String[] args) throws IOException {
        System.out.println("program wyznacza wartosc x dla  c=xa + b ");
        double a, b,c,x;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("podaj liczbe a ");
        a = Double.parseDouble(br.readLine());
        if(a==0){
            System.out.println("zle dane, program sie zamknie");
        }else{
            System.out.println("podaj liczbe b");
            b = Double.parseDouble(br.readLine());
            System.out.println("podaj liczbe c");
            c = Double.parseDouble(br.readLine());

            x=(c-b)/a;

            System.out.println("dla funcji "+c+"="+a+"x +"+b+" \n" +" X wynosi "+x);

        }
    }
}
