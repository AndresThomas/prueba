package numeros_pares_no_pares;

import javax.swing.JOptionPane;

public class Numeros_pares_no_pares {

    public static void main(String[] args) {
        
        int num1,num2;
        
        num1 = Integer.parseInt(JOptionPane.showInputDialog("introduzca un numero"));
        num2=Integer.parseInt(JOptionPane.showInputDialog("introduzca un numero"));
        
        if (num1%2==0&num2%2==0){
            
            JOptionPane.showMessageDialog(null,"los numeros son pares" );
            
        }
        
        else {
            JOptionPane.showMessageDialog(null,"los numeros no son pares");
        }
        
        
        
    }
    
}
