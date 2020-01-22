package e_c2;

import javax.swing.JOptionPane;

public class E_c2 {

    public static void main(String[] args) {
    
        int numero;
        numero=Integer.parseInt(JOptionPane.showInputDialog("ingrese un numero: "));
        
        while(numero!=0){
            if (numero>=1){
                JOptionPane.showMessageDialog(null,"el numero es positivo");
                numero = Integer.parseInt(JOptionPane.showInputDialog("digite otro numero"));
                }
            else{
                JOptionPane.showMessageDialog(null,"el numero es negativo");
                numero = Integer.parseInt(JOptionPane.showInputDialog("digite otro numero"));
            }
        }
        
    }
    
}
