package pl.programowanie.java.helion;

public class zadanie324 {
    public static void main(String[] args) {
        System.out.println("Program wypisuje algebet zwyczajnie i wspak");
        char letter;

        letter = 'Z';
        while (letter >= 'A') {
            if (letter > 'A') {
                System.out.print(letter + ", ");
            } else {
                System.out.print(letter + ".");
            }
            letter--;
        }
        System.out.println();

        letter = 'A';
        while (letter <= 'Z') {
            if (letter < 'Z') {
                System.out.print(letter + ", ");
            } else {
                System.out.print(letter + ".");
            }
            letter++;
        }
    }}


