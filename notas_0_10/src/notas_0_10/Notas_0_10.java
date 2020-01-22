package notas_0_10;

import javax.swing.JOptionPane;

public class Notas_0_10 {
    
    public static void main(String[] args) {
        
        int nota;
        
        nota=Integer.parseInt(JOptionPane.showInputDialog("ingrese un numero"));
        
        switch (nota){
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5: JOptionPane.showMessageDialog(null, "nota insuficiente");
                  break;
            case 6: JOptionPane.showMessageDialog(null, "nota suficiente");
                 break;
            case 7:
            case 8:JOptionPane.showMessageDialog(null, "nota bien");   
               break;
            case 9: JOptionPane.showMessageDialog(null, "nota notable");   
              break;
            case 10:JOptionPane.showMessageDialog(null, "nota sobresaliente");
            break;
            default: JOptionPane.showMessageDialog(null, "eres manco?");
        }
        
        
        
    }
    
}
