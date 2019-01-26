package pl.programowanie.java.helion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class zadaniePoleTrojkata {
    public static void main(String[] args) throws IOException {
        double a, b, pole;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Program policzy pole prostokata ");
        System.out.println("Podaj bok a.");
        a = Double.parseDouble(br.readLine());
        System.out.println("Podaj bok b.");
        b = Double.parseDouble(br.readLine());
        pole = a * b;
        System.out.println("Pole prostokata o boku " + a + " i boku " + b + " wynosi " + pole);
    }
}
