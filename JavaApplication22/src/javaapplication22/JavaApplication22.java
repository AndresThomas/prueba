package javaapplication22;

import javax.swing.JOptionPane;

public class JavaApplication22 {

    public static void main(String[] args) {
        
        int numero,dato=10;
        
        numero = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite un numero"));
        
        if (numero!=dato){
            
            JOptionPane.showMessageDialog(null,"los datos son diferentes");
            
        }
        
        else{
            
            JOptionPane.showMessageDialog(null, "los datos son iguales");
        
    }
        
     /* = asignacion
        == comparacion
        != diferencia
        < menor , <= menor o igual
        > mayor , >= mayor o igual
         los ciclos devuelven booleanos
        */
        
        
        
    }
    
}
