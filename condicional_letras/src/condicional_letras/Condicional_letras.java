package condicional_letras;

import javax.swing.JOptionPane;

public class Condicional_letras {

  public static void main(String[] args) {
        
      char letra;
      
      letra=JOptionPane.showInputDialog("introduzca una letra").charAt(0);
      
      if (Character.isUpperCase(letra)){
          JOptionPane.showMessageDialog(null,"Es una letra mayuscula");
      }
      else{
          JOptionPane.showMessageDialog(null, "es una letra minuscula");
      }
      
      
    }
    
}


// isUpperCase es un metodo para saber si una letra es mayuscula