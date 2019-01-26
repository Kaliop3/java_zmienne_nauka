package pl.programowanie.wyzwanie_JAVA.FirstDay;

import java.util.Scanner;

public class scanner {
    public static void main(String[] args) {
//        String imie;
//        Scanner odczyt=new Scanner(System.in);
//        System.out.println("wpisz imie : ");
//        imie=odczyt.nextLine();
//
//        System.out.println("Witaj "+imie);

        double inter;
        double inter2;
        Scanner odczyt = new Scanner(System.in);
        System.out.println("Wpisz liczne nastepnie enter i koleją ");
        inter = odczyt.nextDouble();

        inter2 = odczyt.nextDouble();

        double sum = inter + inter2;
        double sub = inter - inter2;
        double multi = inter * inter2;
        double divison = inter / inter2;

        System.out.println(sum);
        System.out.println(sub);
        System.out.println(multi);
        System.out.println(divison);


    }
}

