package tiposdedatos;


public class TiposDeDatos {


    public static void main(String[] args) {
        
        byte entero=10;   //ocupa 8 bits en la memoria y su rango es de -128 hasta 127
        
        short numero=120; //16 bits de memoria con rango de -32,768 a 32,767
        
        int num=2147483647; //ocupa 32 bits de mmeoria rango -2,147,483,648 a 2,147,483,647
        
        long nu=97634; //64 bits en memoria y rango de -9,223,372,036,854,775,808 a 9,223,372,854775,807
        
        float n=134.645f; //32 bits rango : 1.4e-045 a 3.4e+038 y al final del numero se pone "f"
        
        double decimal=234.99; // 64 bits , rango 4.9e-324 a 1.8e+308
        
        char caracter= 'e'; //para almacenar caracteres, usar Alt+39 para sacar ->'<-
        
        boolean decision= true; //es 1 byte booleano con valor true, false (verdadero,falso)
        
        System.out.println("la variable byte vale"+" "+entero);
        System.out.println("la variable short vale"+" "+numero);
        System.out.println("la variable int vale"+" "+num);
        System.out.println("la variable long vale"+" "+nu);
        System.out.println("la variable float vale"+" "+n);
        System.out.println("la variable double vale"+" "+decimal);
        System.out.println("la variable char vale"+" "+caracter);
        System.out.println("la variable booleana es"+" "+decision);
        
        
        //variables primitivas
    }
    
}
