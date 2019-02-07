package pl.programowanie.java.helion;

public class zadanie324 {
    public static void main(String[] args) {
        System.out.println("Program wypisuje algebet zwyczajnie i wspak");
        char letter = 'Z';

        do{
            if (letter > 'A') {
                System.out.print(letter + ", ");
            } else {
                System.out.println(letter + ".");
            }
            letter--;
        }while(letter>='A');

    }
}
