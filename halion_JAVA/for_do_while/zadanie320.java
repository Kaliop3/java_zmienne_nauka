package pl.programowanie.java.helion;

public class zadanie320 {
    public static void main(String[] args) {
        int n = 10, wiersze = 0, kolumny = 0;
        System.out.println("Program wyswietla tabliczke mnozenia dla liczb od 1-100 ");
        wiersze = 1;
        do {
            kolumny = 1;
            do {
                System.out.print(wiersze * kolumny + "\t");
                kolumny++;

            } while (kolumny <= n);
            wiersze++;
            System.out.println();
        } while (wiersze <= n);
    }
}
