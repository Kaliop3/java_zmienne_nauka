package pl.programowanie.java.helion;

public class zadanie31 {
    public static void main(String[] args) {
        int y;
        System.out.println("Program oblicza wartosci funkcji y=3x");
        System.out.println("Dla x przyjmujacego wartosci 0-10");
        for (int x=0;x<=10;x++){
            y=3*x;
            System.out.println("x = "+x+'\t'+"y = "+y);
        }
    }
}
