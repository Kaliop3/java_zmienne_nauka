package pl.programowanie.java.helion;

public class zadanie37_39 {
    public static void main(String[] args) {
        System.out.println("Program liczy sume liczb od 1 do 100 ");
        int sum=0,i=0;
        for(i=1;i<=100;i++){
            sum+=i;
        }
        System.out.println("Suma wynosi "+sum );

        int sumd=0,l=1;
        do{
            sumd+=l;
            l++;
        }while (l<=100);
        System.out.println("Do ...while sum "+sumd);

        int sumwh=0,k=1;
        while(k<=100){
            sumwh+=k;
            k++;
        }
        System.out.println("While sum "+sumwh);
    }
}
