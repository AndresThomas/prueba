package ahorcado;

import java.util.ArrayList;
import java.util.Scanner;

public class Ahorcado {

   public static void main(String[] args) {
        
       Scanner entrada = new Scanner(System.in);
       boolean victoria = false;
       boolean encontrado = false;
       String palabra;
       boolean palabra2 = false;
       ArrayList<String> memoria = new ArrayList();
        //obtener la palabra clave       
        
        do{
            System.out.println("Ingrese la palabra clave");
        
              palabra = entrada.nextLine();
          
            if(palabra.length() > 0)
                palabra2 = true;      
        }while(palabra2 == false);
        //System.out.println(palabra.length());
        
        //imprime espacios para ocultar las impresiones anteriores
        for (int i = 0; i < 1000; i++) {
            System.out.println("");
       }
        
        //imprime las lineas segun las letras de la palabra
        for (int i = palabra.length(); i > 0; i--) {
            System.out.print("_ ");
        }
        
        System.out.println("");
        
        //empezaremos a adivinar letras
        
        char letra;
        int cont = 0;
        
        while(victoria != true ){
            
            System.out.println("Digite una letra");
            
            letra = entrada.nextLine().charAt(0);
                
            for (int i = 0; i < palabra.length(); i++) {

               if(palabra.charAt(i) == letra  ){
                   //victoria = true;
                    cont++;
                }
            }

            if(cont > 0){
                System.out.println("Bien hecho encontrado "+ cont);
                
                for (int i = 0; i < palabra.length(); i++) {

                    if(palabra.charAt(i) == letra  ){
                        //victoria = true;
                        //System.out.print(letra);
                        
                        if(memoria.size() == 0)
                            memoria.add(letra+"");
                        
                        for (String string : memoria) {
                            if(string.compareToIgnoreCase(letra+"")== 0){
                                encontrado = false; // si ya esta dentro la letra no la agrega
                            }else{
                                encontrado = true;
                            }
                        }
                        
                        if(encontrado)
                            while(cont !=0){
                                memoria.add(letra+"");
                                System.out.print(letra);
                                cont--;
                            }
                        cont = 0;
                        
                    }else{
                        System.out.print("_ ");                                
                    }
                }
                
                //System.out.println(memoria+" memoria");
                
            }else{
                System.out.println("Intenta otra letra :c");
            }
                System.out.println("");
                System.out.println(memoria);
            
                if(memoria.size() == palabra.length()){
                    victoria = true;
                    System.out.println("Ganador");
                }
                
        }
    }
}
