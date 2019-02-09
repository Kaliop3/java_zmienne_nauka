package pl.programowanie.java.helion;

public class zadanie34 {
    public static void main(String[] args) {
        System.out.println("program wyswietla liczby calkowite od 1-20");
        int i;
        for(i=1;i<=20;i++){
            if (i<20){
                System.out.print(i+",");
            }
            else{
                System.out.println(i+".");
            }
        }
    }
}
