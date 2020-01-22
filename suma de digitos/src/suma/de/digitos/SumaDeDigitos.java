package suma.de.digitos;

import java.util.Scanner;

public class SumaDeDigitos {

   
    public static void main(String[] args) {
        
        int suma,numero;      
        
        System.out.println("ingrese un numero");
        
        Scanner Entrada = new Scanner (System.in);
        
         numero = Entrada.nextInt();
         suma=0;
         while(numero!=0){
         suma=suma+(numero%10);
         numero=numero/10;
                  
         }
         
         System.out.println("la suma de digitos es:");
         System.out.println(suma);
         
      
        
    }
    
}
