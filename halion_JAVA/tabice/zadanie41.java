package pl.programowanie.java.helion;

public class zadanie41 {
    public static void main(String[] args) {
        int i,n=10;
        int dane[]=new int[n];
        for(i=0;i<dane.length;i++){
            dane[i]=n-1-i;
            System.out.println("dane["+i+"] = "+dane[i]);
        }
    }
}
