package pl.programowanie.wyzwanie_JAVA.FirstDay.SecendDay;

import java.util.Scanner;

public class tablice {
    public static void main(String[] args) {
        int[] tab = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};


        for (int i = 0; i < tab.length; i++) {
            System.out.print(tab[i]+" ");
        }

        String[] produkty = {"koala", "goru", "ceramika", "mika", "wolastonit", "mullit"};
        for (int i = 0; i < produkty.length; i++) {
            System.out.println(produkty[i]);
        }

        int[] array;

        int zakres;
        Scanner odczyt = new Scanner(System.in);
        System.out.println("Ile liczb ma wyswietlic ");
        zakres = odczyt.nextInt();
        array = new int[zakres];

        for (int s = 0; s < array.length; s++) {
            array[s] = s + 1;
        }
        int l = 0;
        while (l < array.length) {
            System.out.print(array[l] + " ");
            l++;
        }
    }
}
