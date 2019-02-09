package pl.programowanie.java.helion;

import java.util.Random;

public class zadanie318 {
    public static void main(String[] args) {
        int ilosc_liczb = 2, i = 1;
        double liczba, sum = 0, min, max;

        System.out.println("Program losuje " + ilosc_liczb + " liczb calkowitych od 0 do 99,");
        System.out.println("a nastepnie znajduje najmniejsza i najwieksza ");
        System.out.println("oraz oblicza srednia ze wszystki wylosowanych liczb");

        Random r = new Random();
        min = Math.round(100 * (r.nextDouble()));
        System.out.println();
        System.out.print("Wylosowano liczby : " + min + ", ");
        max = min;
        sum += max;
        while (i <= ilosc_liczb - 1){
            liczba = Math.round(100 * (r.nextDouble()));
            System.out.print(liczba + ", ");
            if (max < liczba) max = liczba;
            if (liczba < min) min = liczba;
            i++;
        }

        System.out.println();
        System.out.println("najwieksza liczba to " + max + ", ");
        System.out.println("najmniejsza liczba to " + min + ", ");
        System.out.println("srednia wynosi " + sum / ilosc_liczb + ".");
    }
}
