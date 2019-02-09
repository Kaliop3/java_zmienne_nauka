package pl.programowanie.wyzwanie_JAVA.FirstDay.SecendDay;

import java.util.Scanner;

public class operatorsCalculon {
    public static void main(String[] args) {
        Scanner odczyt = new Scanner(System.in);
        System.out.println("Wypisz 1 licze : ");
        double a = odczyt.nextDouble();
        System.out.println("Wypisz 2 licze : ");
        double b = odczyt.nextDouble();
        System.out.println("Wypisz 3 licze : ");
        double c = odczyt.nextDouble();

        double resut=(a+b)*c;
        double resut1=a-b/c;

        double result2=a++/c++;

        boolean porownanie = (a+b)>c;

        System.out.println(resut);
        System.out.println(resut1);
        System.out.println(result2);
        System.out.println(porownanie);

    }
}
