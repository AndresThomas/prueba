package ejercicio_1;

import java.util.Scanner;

public class Ejercicio_1 {
    



    public static void main(String[] args) {

        
        int numero,res;    
        Scanner entrada = new Scanner (System.in);
        System.out.print("digite un numero: ");
        
        numero = entrada.nextInt();
        
        res = numero - ((numero/10)*10);
        
       // System.out.println(res); para comprobar el ultimo digito
            
         if (res==4){
             System.out.println("el numero termina en 4");
         } 
         else {
             System.out.println("el numero no termina en 4");
        }
            
 }       
 }