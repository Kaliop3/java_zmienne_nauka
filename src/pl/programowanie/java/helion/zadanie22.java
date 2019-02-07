package pl.programowanie.java.helion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class zadanie22 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        double a, b, c, delta, x1, x2;

        System.out.println("Program policzy pierswiastki rownania y = ax2 + bx + c");

        System.out.println("Podaj a");
        a = Double.parseDouble(br.readLine());
        System.out.println("Podaj b");
        b = Double.parseDouble(br.readLine());
        System.out.println("Podaj c");
        c = Double.parseDouble(br.readLine());

        delta = (b * b) - 4 * c * a;

        System.out.println("Pierwiastkami rownania " + a + "x^2 + " + b + "x + " + c + " ");

        if (delta < 0) {
            System.out.println("funkcja nie ma miejsc zerowych");

        } else if (delta > 0) {

            x1 = ((-b) + Math.sqrt(delta)) / (2 * a);
            x2 = ((-b) - Math.sqrt(delta)) / (2 * a);

            System.out.printf("x1 = " + "%2.2f", x1);
            System.out.println(" ");
            System.out.printf("x2 = " + "%2.2f", x2);
        } else {
            x1 = (-b) / (2 * a);
            System.out.printf("Finkcja ma jedno miejsce zerowe podwojne w punkcie " + "%2.2f", x1);
        }
    }
}
