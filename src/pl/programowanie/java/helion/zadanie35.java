package pl.programowanie.java.helion;

public class zadanie35 {
    public static void main(String[] args) {
        System.out.println("program wyswietla liczby calkowite od 1-20");
        int i=0;
        do {
            i++;
            if(i<20){
                 System.out.print(i+", ");
            }else{
                System.out.println(i+".");
            }

        }while(i<20);
    }

}
