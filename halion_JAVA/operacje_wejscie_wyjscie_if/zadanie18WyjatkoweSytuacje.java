package pl.programowanie.java.helion;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class zadanie18WyjatkoweSytuacje {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        double a, b, pole;

        try {
            System.out.println("Podaj bok prostokata ");
            a = Double.parseDouble(br.readLine());
            System.out.println("Podaj kolejny bok ");
            b = Double.parseDouble(br.readLine());

            pole=a*b;
            System.out.println("Pole wynosi "+pole);

        }
        catch (NumberFormatException exc){
            System.out.println("Nie wczytano liczby. Program sie zamknie.");
        }
    }
}
