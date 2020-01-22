package dos_numeros;

import javax.swing.JOptionPane;

public class Dos_numeros {
    
    public static void main(String[] args) {
      
        int numero1,numero2;
        
        numero1= Integer.parseInt(JOptionPane.showInputDialog("ingrese un numero: "));
        numero2= Integer.parseInt(JOptionPane.showInputDialog("ingrese otro numero"));
        
        if (numero1<numero2){
            
            JOptionPane.showMessageDialog(null, "el numero "+numero2+" es mayor");           
        }
        
        if (numero1>numero2){
            JOptionPane.showMessageDialog(null, "el numero "+numero1+" es mayor");
        }   
            if (numero1==numero2){
                JOptionPane.showMessageDialog(null,"los numeros son iguales");
            }
        
        
        
    }
    
}
