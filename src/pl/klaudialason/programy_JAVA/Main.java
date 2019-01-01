package pl.klaudialason.programy_JAVA;

//Komentarz
public class Main {//class
    public static void main(String[] args) {
        /*
        metoda miejsce startu aplikacji
        [] -
        */
        System.out.printf("Hello  Klaudia ");

     for (int i = 1; i <= 1000; i++) {
        if ((i % 3 == 0) || (i % 7 == 0)) {
            System.out.print(i);
            if (i < 999) {
                System.out.print(", ");
            }
        }
    }
    }
}
