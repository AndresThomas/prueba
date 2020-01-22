package e_c;

import javax.swing.JOptionPane;

public class E_c {
    
    public static void main(String[] args) {
        int numero,cuadrado;
        
        numero = Integer.parseInt(JOptionPane.showInputDialog("digite un numero"));
        
        while (numero>=0){
            
            cuadrado = (int)Math.pow(numero, 2);
            
            JOptionPane.showMessageDialog(null,"el numero elevado al cuadrado es: "+cuadrado);
            
            numero = Integer.parseInt(JOptionPane.showInputDialog("digite otro numero"));
            
        }
        
        
        
        
    }
    
}
