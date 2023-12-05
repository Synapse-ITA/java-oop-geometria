package org.lessons.java.geometria;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("INSERISCI LA MISURA DELLA BASE DEL RETTANGOLO (in cm)");
        int newWidth = scanner.nextInt();
        System.out.println("INSERISCI LA MISURA DELL'ALTEZZA DEL RETTANGOLO (in cm)");
        int newHeight = scanner.nextInt();

        Rettangolo rettangoloUno = new Rettangolo(newWidth, newHeight);
        System.out.println("Base: " + newWidth + "cm");
        System.out.println("Altezza: " + newHeight + "cm");
        System.out.println("L'area del rettangolo è: " + rettangoloUno.calcoloArea() + "cm^2");
        System.out.println("Il perimetro del rettangolo è: " + rettangoloUno.calcoloPerimetro() + "cm");



        scanner.close();
    }
}
