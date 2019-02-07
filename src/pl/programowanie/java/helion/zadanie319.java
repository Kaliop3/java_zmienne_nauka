package pl.programowanie.java.helion;

public class zadanie319 {
    public static void main(String[] args) {
        int n=10, wiersze,kolumny;
        System.out.println("Program wyswietla tabliczke mnozenia dla liczb od 1-100 ");
        for(wiersze=1;wiersze<=n;wiersze++){
            for(kolumny=1;kolumny<=n;kolumny++){
                System.out.print(wiersze*kolumny+"\t");

            }
            System.out.println();
        }
    }
}

