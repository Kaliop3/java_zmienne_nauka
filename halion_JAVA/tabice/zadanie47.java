package pl.programowanie.java.helion;

public class zadanie47 {
    public static void main(String[] args) {
        int n = 10, i, j, suma, suma2;
        int macierz[][] = new int[n][n];

        for (i = 0; i < macierz.length; i++) {
            for (j = 0; j < macierz.length; j++) {
                if (j == 0) {
                    macierz[i][j] = i;
                } else if (j == 1) {
                    macierz[i][j] = i * i;
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

        suma = 0;
        suma2=0;
        for (i = 0; i < macierz.length; i++) {
            suma += macierz[i][0];
            suma2+= macierz[i][1];
        }

        System.out.println("Suma wyroznionych elementow w pierwszej kolunmie wynosi  " + suma + " a w drugiej "+suma2+".");

    }

}
