package el_cuadrado_suma;
import java.util.Scanner;
public class El_cuadrado_suma {

    public static void main(String[] args) {
    
        int a,b;
        double suma,sumaf;
        Scanner entrada = new Scanner(System.in);
        System.out.print("ingrese un digtito: ");
        
        a=entrada.nextInt();
        System.out.print("ingrese otro digito: ");
        
        b=entrada.nextInt();
        
        
        double base=a,exponente=2;
        double resultado= Math.pow(base, exponente);
        double base1=b,exponente1=2;
        double resultado2= Math.pow(base1, exponente1);
        
        suma=resultado+resultado2; 
        sumaf=suma+(2*(a*b));
        System.out.println(sumaf);        
    }
    
}
