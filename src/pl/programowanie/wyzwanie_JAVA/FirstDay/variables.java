package pl.programowanie.wyzwanie_JAVA.FirstDay;

public class variables {
    public static void main(String[] args) {
        final double liczbaPi = 3.14;
        final int years = 24;
        int liczba;
        liczba = 58;
        char znak = 'S';
        System.out.println(liczbaPi);
        System.out.println(liczba);
        System.out.println(years);
        System.out.println(znak);

        String hello = "Welcome";
        String question = "How are you?";
        String me = "Im fine, and you?";
        String powitanie = hello + ", " + question + " " + me;

        System.out.println(powitanie);

        String hey = powitanie.substring(0,12);
        System.out.println(hey);


    }
}
