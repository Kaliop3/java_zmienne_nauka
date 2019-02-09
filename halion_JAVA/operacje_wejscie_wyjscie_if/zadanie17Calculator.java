package pl.programowanie.java.helion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class zadanie17Calculator {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("You can sum, differ, multyply, division your number ");
        System.out.println("Give first number :");
        double a, b, sum, diff, multy, div;
        a = Double.parseDouble(br.readLine());
        System.out.println("Give another ");
        b = Double.parseDouble(br.readLine());

        sum = a + b;
        diff = a - b;
        multy = a * b;
        div = a / b;

        System.out.printf("For number "+"%2.2f ",a);
        System.out.printf("and "+"%2.2f ",b);

        System.out.print("\nsum= ");
        System.out.printf("%2.2f ",sum);
        System.out.print("\ndiff= ");
        System.out.printf("%2.2f ",diff);
        System.out.print("\nmulty= ");
        System.out.printf("%2.2f ",multy);
        System.out.print("\ndivision = ");
        System.out.printf("%2.2f ",div);


    }
}
