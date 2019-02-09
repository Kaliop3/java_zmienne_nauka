package pl.programowanie.java.helion;

public class zadanie43 {
    public static void main(String[] args) {
        int n = 10, i, j, suma;
        int macierz[][] = new int[n][n];
        for (i = 0; i < macierz.length; i++) {
            for (j = 0; j < macierz.length; j++) {
                if (i+j==9) {
                    macierz[i][j] = i;
                } else {
                    macierz[i][j] = 0;
                }
            }
        }
        for (i = 0; i < macierz.length; i++) {
            for (j = 0; j < macierz.length; j++) {
                System.out.print(macierz[i][j] + " ");
            }
            System.out.println();
        }
        suma=0;
        for (i=0;i<macierz.length;i++){
            suma+=macierz[i][n-1-i];
        }
        System.out.println("Suma wyroznionych elementow w tablicy wynosi  "+suma+".");

    }
}
