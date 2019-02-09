package pl.klaudialason.programy_JAVA.Zadania_jkozak;

public class Ad1 {
    private static double changeCelstoFahrenh(double cels) {
        return (1.8 * cels + 32.0);
    }

    private static int[] maxAndMin(int a, int b, int c) {
        int max = 0;
        int min = 0;
        if (a > b) {
            if (a > c) {
                max = a;
                if (b > c) {
                    min = c;
                } else {
                    min = b;
                }
            } else {
                max = c;
                min = b;
            }
        } else if (b > c) {
            max = b;
            if (c > a) {
                min = a;
            } else {
                min = c;
            }
        } else {
            max = c;
            min = a;
        }
        return new int[]{max, min};
    }

    private static double weightCheck(double weigth, double height) {
        double result = 0;
        result = weigth / (height*height);

        if (result > 18.5 && result < 24.9) {
            System.out.println("Waga prawidlowa");
        } else if (result < 18.5) {
            System.out.println("Niedowaga");
        } else {
            System.out.println("Nadwaga");
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(weightCheck(95, 1.85));

    }
}
