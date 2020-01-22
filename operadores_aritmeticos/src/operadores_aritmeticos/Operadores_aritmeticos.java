package operadores_aritmeticos;

import java.util.Scanner;


public class Operadores_aritmeticos {


    public static void main(String[] args) {
      
        float num,num1,suma,resta,mult,div,mod;
        Scanner entrada = new Scanner(System.in);        
        
        System.out.print("Ingrese dos numeros: ");
        num = entrada.nextFloat();
        num1 = entrada.nextFloat();
        
        suma= num + num1;
        resta=num - num1;
        mult=num*num1;
        div=num/num1;
        mod=num%num1;
        System.out.println("la suma es: "+suma);
        System.out.println("la resta es: "+resta);
        System.out.println("la multiplicacion es: "+mult);
        System.out.println("la division es: "+div);
        System.out.println("el modulo es: "+mod);
        
        
        
    }
    
}
