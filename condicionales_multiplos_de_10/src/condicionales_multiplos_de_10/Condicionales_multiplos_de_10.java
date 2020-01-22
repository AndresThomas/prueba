package condicionales_multiplos_de_10;

import javax.swing.JOptionPane;

public class Condicionales_multiplos_de_10 {

    public static void main(String[] args) {
        
        int num;
        
        num= Integer.parseInt(JOptionPane.showInputDialog("ingrese un numero"));
        
        if (num%10==0){
            
            JOptionPane.showMessageDialog(null, "el numero es multiplo de 10 ");
        }
        
        else {
            JOptionPane.showMessageDialog(null, "el numero no es multiplo de 10");
        }
        
    }
    
}
