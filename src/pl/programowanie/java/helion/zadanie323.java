package pl.programowanie.java.helion;

public class zadanie323 {
    public static void main(String[] args) {
        System.out.println("Program wypisuje algebet zwyczajnie i wspak");
        char znak = 'A';
        do {
            if (znak < 'Z') {
                System.out.print(znak + ", ");
            } else {
                System.out.print(znak + ".");
            }
            znak++;
        } while (znak <= 'Z');
        System.out.println();

        char letter = 'Z';

        do {
            if (letter > 'A') {
                System.out.print(letter + ", ");
            } else {
                System.out.println(letter + ".");
            }
            letter--;
        } while (letter >= 'A');

    }

}


