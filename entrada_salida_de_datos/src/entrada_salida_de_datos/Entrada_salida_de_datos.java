package entrada_salida_de_datos;

import java.util.Scanner;  //importacion de la libreria


public class Entrada_salida_de_datos {

    
    public static void main(String[] args) {
     
        Scanner entrada= new Scanner (System.in); //clase scanner para entrada de teclado 
        int numero;
        Scanner ent= new Scanner (System.in);
        float num;
        double n;
        Scanner e = new Scanner(System.in);
        System.out.print("Digite un numero: ");
        
        numero= entrada.nextInt(); // entrada de tipo entero 
        
        System.out.println("el numero es "+numero);
        
        System.out.print("inrese un real: ");
        
        num= ent.nextFloat(); //cambia el nextin por next float
        
        System.out.println("el real es: "+num);
        
        System.out.print("digite un numero: ");
        
        n= e.nextDouble(); // de igual forma aqui
        System.out.println("el doble es: "+n);
        
        System.out.print("Digite una cadena: ");
        
        //separacion para guardar cadenas (palabras)
        
        String  Cadena;
        Scanner palabra = new Scanner (System.in);
        
        //Cadena= palabra.next(); // solo guarda la cadena hasta que encuntre un espacio 
        
        Cadena= palabra.nextLine(); // guarda la cadena o palabra igual que se digita
        System.out.println("la cadena es: "+Cadena);
        // separacion para caracteres
        
        char letra;
        Scanner let = new Scanner (System.in);
        System.out.print("digite una letra: ");
        
        letra= let.next().charAt(0); //el 0 de charArt es para leer y guardar solo el primer caracter digitado
        
        System.out.println("la letra es: "+letra);
        
        
    }
    
}
