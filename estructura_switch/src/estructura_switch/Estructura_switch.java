package estructura_switch;

import javax.swing.JOptionPane;

public class Estructura_switch {
    
    public static void main(String[] args) {
     
        int dato;
        
        dato = Integer.parseInt(JOptionPane.showInputDialog("digite un numero entre 1 y 5"));
        
        switch (dato){
            
            case 1 : JOptionPane.showMessageDialog(null,"el numero es 1");
             break;
            case 2: JOptionPane.showMessageDialog(null, "el numero es 2");
            break;
            case 3: JOptionPane.showMessageDialog(null, "el numero es 3");
            break;
            case 4: JOptionPane.showMessageDialog(null, "el numero es 4");
            break;
            case 5: JOptionPane.showMessageDialog(null, "el numero es 5");
            break;
            default : JOptionPane.showMessageDialog(null,"el numero esta fuera de rango");
            
            
        }
        
    }
    
}
