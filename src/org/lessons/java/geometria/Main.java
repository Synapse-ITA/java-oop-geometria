package org.lessons.java.geometria;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("SCEGLI LA BASE DEL TUO RETTANGOLO");
        int newWidth = scanner.nextInt();
        System.out.println("SCEGLI L'ALTEZZA DEL TUO RETTANGOLO");
        int newHeight = scanner.nextInt();

        Rettangolo rettangoloUno = new Rettangolo(newWidth, newHeight);
        System.out.println(rettangoloUno.calcoloArea());
        System.out.println(rettangoloUno.calcoloPerimetro());

        scanner.close();
    }
}
