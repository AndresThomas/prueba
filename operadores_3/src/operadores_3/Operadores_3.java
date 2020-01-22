package operadores_3;


public class Operadores_3 {

 
    public static void main(String[] args) {
        double raiz = Math.sqrt(9); // procedimiento para sacar una raiz
        // la class Math solo usa valores dobles
        int raiz2 = (int)Math.sqrt(16);
        //para usar datos enteros y no dobles
        System.out.println("la raiz cuadrada es: "+raiz);
        System.out.println("la otra raiz es : "+raiz2);
        //.sqrt es para sacar raiz cuadrada 
        
        double base=5, exponente=2;
        double resultado = Math.pow(base, exponente);
        
        System.out.println("el numero elevado es: "+resultado);
        
        // .pow para elevar numeros a una potencia 
        double numero=4.56;
        long res= Math.round(numero);
        
        float num=4.56f;
        int resul= Math.round(num);
        
        System.out.println("el numero 1 redondeado es :"+res);
        System.out.println("el numero 2 redondeado es: "+resul);
        
        
        double n= Math.random();
        
        System.out.println("el numero aleatorio es: "+n);
                     
    }
    
}
