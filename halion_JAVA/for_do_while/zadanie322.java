package pl.programowanie.java.helion;

public class zadanie322 {
    public static void main(String[] args) {
        System.out.println("Program wypisuje algebet zwyczajnie i wspak");

        char znak;
        for (znak = 'A'; znak <= 'Z'; znak++) {
            if (znak < 'Z') {
                System.out.print(znak + ", ");
            } else System.out.print(znak + ". ");
        }
        System.out.println();


        for (znak = 'Z'; znak >= 'A'; znak--) {
            if (znak > 'A') {
                System.out.print(znak + ", ");
            } else System.out.print(znak + ".");
        }
    }

}
