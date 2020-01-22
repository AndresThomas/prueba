package ejercicio_2;

import java.util.Scanner;

public class Ejercicio_2 {

   
    public static void main(String[] args) {
     
        int cont =0,num;
        Scanner entrada = new Scanner (System.in);
        
        System.out.print("introduzca un numero: ");        
        
        num = entrada.nextInt();
        
        while (num!=0) {
            
            num=num/10;
            cont= cont+1;
                  
        }
        
        if (cont==3){
            
            System.out.println("El numero tiene 3 digitos");}
        
        else {
            
            System.out.println("El numero no tiene 3 digitos");
             
        }
        
        
    }
    
}
