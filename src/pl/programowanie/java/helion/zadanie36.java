package pl.programowanie.java.helion;

public class zadanie36 {
    public static void main(String[] args) {
        System.out.println("program wyswietla liczby calkowite od 1-20");
        int i=1;
        while(i<=20){
            if(i<20){
            System.out.print(i+", ");
        }else{
                System.out.println(i+".");
            }
            i++;
        }
    }
}
