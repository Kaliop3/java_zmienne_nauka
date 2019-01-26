package pl.programowanie.java.helion;

import java.io.*;

public class zadanie13ObjetoscKuli {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        double r, objetosc;
        System.out.println("Program obliczy objetosc kuli.");
        System.out.println("Podaj promien kuli. ");
        r = Double.parseDouble(br.readLine());
        objetosc=4*Math.PI*r*r*r/3;

        System.out.printf("Objetosc kuli dla r="+r+" wynosi "+"%2.2f\n", objetosc);


    }
}
