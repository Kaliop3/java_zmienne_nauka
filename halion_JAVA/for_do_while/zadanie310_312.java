package pl.programowanie.java.helion;

public class zadanie310_312 {
    public static void main(String[] args) {
        System.out.println("Program oblicza sume liczb parzystych w zakresie 1-100");
        int i = 0, sum = 0;
        for (i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                sum += i;
            }
        }
        System.out.println("For suma wynosi " + sum);

        int l = 1, sumd = 0;
        do {
            if (l % 2 == 0) sumd += l;

            l++;
        } while (l <= 100);
        System.out.println("Do ... while suma " + sumd);


        int j = 1, sumwh = 0;
        while (j <= 100) {
            if (j % 2 == 0) sumwh += j;

            j++;
        }
        System.out.println("While sum " + sumwh);


    }
}
