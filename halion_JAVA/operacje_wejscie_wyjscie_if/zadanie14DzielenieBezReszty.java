package pl.programowanie.java.helion;

public class zadanie14DzielenieBezReszty {
    public static void main(String[] args) {
        System.out.println("Program dzieli bez reszty.");
        int a = 37;
        int b = 11;

        int result = a / b;
        System.out.println("Dla liczb a=" + a + " b= " + b);
        System.out.println("Obliczono "+a+"/"+b );

        System.out.println("Wynik dzielenia wybosi " + result);

        System.out.println("Reszta z dzielenia ");

        int rest=a%b;
        System.out.println("Reszta z dzielenia wynosi "+rest);

    }
}
