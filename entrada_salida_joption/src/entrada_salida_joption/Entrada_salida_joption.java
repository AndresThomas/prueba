package entrada_salida_joption;

import javax.swing.JOptionPane; /* herramienta para entrada por medio de 
                                   ventanas emergentes */


public class Entrada_salida_joption {

   
    public static void main(String[] args) {
       
        int entero;
        char letra;
        double num;
        String palabra;
        
        palabra = JOptionPane.showInputDialog("Digite una cadena: "); /*JOptionPane.showInputDialog
                                                                       lo que permite las ventanas emergentes
                                                                        Input es de entrada  */
        entero = Integer.parseInt(JOptionPane.showInputDialog("Digite una numero: "));
        // usamos Interger (variable no primitiva) y parseInt para convertir de cadena a entero y no salga ningun error
        
        letra = JOptionPane.showInputDialog("digite una letra").charAt(0);
        // .charArt(0) para guardar un decimal
        
        num= Double.parseDouble(JOptionPane.showInputDialog("digite un numero con decimal"));
        
        JOptionPane.showMessageDialog(null,"La palabra es: "+palabra);
        JOptionPane.showMessageDialog(null,"El numero es: "+entero);
        JOptionPane.showMessageDialog(null,"El decimal es: "+num);
        JOptionPane.showMessageDialog(null,"La letra es: "+letra);
        
        /*usamos JOptionPane para ventanas emergentes con .show pero cambiamos el Input por
        MessageDialog, ahora en el primer parametro será null y por ultimo mandamos a imprimir algo */
        
        
    }
    
}
