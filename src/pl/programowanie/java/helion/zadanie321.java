package pl.programowanie.java.helion;

public class zadanie321 {
    public static void main(String[] args) {
        int n = 10, wiersze = 1, kolumny = 1;
        System.out.println("Program wyswietla tabliczke mnozenia dla liczb od 1-100 ");
        wiersze=1;
        while (wiersze<=n){
            kolumny=1;
            while (kolumny<=n){

                System.out.print(wiersze*kolumny+"\t");
                kolumny++;
            }
            wiersze++;
            System.out.println();
        }
    }
}
