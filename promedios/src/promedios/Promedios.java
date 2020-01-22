package promedios;

import java.util.Scanner;


public class Promedios {

    
    public static void main(String[] args) {
        float participacion,examen,examen2,examenf,promedio;
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("ingrese la calificacion de la participacion: ");
        
        participacion=entrada.nextFloat(); // la participacion tiene 10%
        
        participacion*=0.10;
        
        System.out.print("ingrese la calificacion del examen 1: ");
        examen=entrada.nextFloat();
        examen*=0.25;  // 25%
        
        System.out.print("ingrese la calificacion del examen 2: ");
        examen2=entrada.nextFloat();
        examen2*=0.25;
        
        System.out.print("ingrese la calificacion del examen final: ");
        examenf=entrada.nextFloat();
        examenf*=0.40;
        
        promedio=participacion+examen+examen2+examenf;
        
        System.out.println("el promedio es: "+promedio);
        
    }
    
}
