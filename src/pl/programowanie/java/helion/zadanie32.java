package pl.programowanie.java.helion;

public class zadanie32 {
    public static void main(String[] args) {
        int x=0,y;
        System.out.println("Progeram oblicza wartosci dla funkcji y = 3x, x C <1,10>");
        do{
            y=3*x;
            System.out.println("x = "+x +'\t'+"y = "+y);
            x++;

        }
        while(x<=10);
    }
}
