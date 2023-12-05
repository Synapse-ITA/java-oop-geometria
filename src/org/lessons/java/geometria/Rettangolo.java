package org.lessons.java.geometria;

public class Rettangolo {

    // CLASSE RETTANGOLO ATTRIBUTI
    //
        int width;
        int height;

        // COSTRUTTORE
        Rettangolo (int width, int height){
            System.out.println("Costruttore");
           this.width = width;
            this.height = height;
        }

        // METODO 1: CALCOLA AREA
        int calcoloArea(){
            int area = width * height;
            return area;
        }

    // METODO 2: CALCOLO PERIMETRO
    int calcoloPerimetro(){
        int perimetro = (width * 2) + (height * 2);
        return perimetro;
    }

    @Override
    public String toString() {
        return "Rettangolo{" +
                "width=" + width +
                ", height=" + height +
                '}';
    }

}






