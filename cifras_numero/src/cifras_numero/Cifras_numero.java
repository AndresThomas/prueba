package cifras_numero;

import javax.swing.JOptionPane;

public class Cifras_numero {
    
    public static void main(String[] args) {
      
        int numero,cont=0;
        
        numero=Integer.parseInt(JOptionPane.showInputDialog("ingrese un numero"));
        
        do{
            if(numero!=0){
            
                numero/=10;
                cont+=1;
                System.out.println(cont);
            }
        }while(numero!=0);
        
        JOptionPane.showMessageDialog(null,"el numero tiene "+cont+" cifras");
        
        
        
    }
    
}
