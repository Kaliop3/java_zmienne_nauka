package pl.programowanie.java.helion;

public class zadanie33 {
    public static void main(String[] args) {
        System.out.println("Onliczenie wartosci x dla funkcji y=3x WHILE");
        int x=0,y=0;
        while(x<=10){
            y=3*x;
            System.out.println("x = "+x+'\t'+"y = "+y);
            x++;
        }
    }

}
