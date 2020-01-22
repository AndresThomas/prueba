package calcular_dinero;
import java.util.Scanner;
public class Calcular_dinero {


    public static void main(String[] args) {
        
        float j,g,l;
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("introduzca la cantidad de dinero que tiene guillermo: ");
        
        g = entrada.nextFloat();
        l=g;
        j=l ;       
        System.out.println("guillermo tiene "+g+" de dinero");
        
        l/=2; //para el dinero de luis
        System.out.println("luis tiene "+l+" de dinero");
        
        j=(l+g)/2; //para el dinero de juan
        
        System.out.println("juan tiene "+j+ "de dinero");
        
        g+=l+j; //para obtener el dinero total
        System.out.println("la suma total del dinero es "+g);
        
        
       
        
        
        
    }
    
}
