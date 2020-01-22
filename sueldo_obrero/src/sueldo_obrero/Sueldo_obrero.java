package sueldo_obrero;

import javax.swing.JOptionPane;

public class Sueldo_obrero {

    
    public static void main(String[] args) {
        
        int sueldo,horas,extra,cont=0;
        
        horas=Integer.parseInt(JOptionPane.showInputDialog("introduzca las horas trabajadas"));
        
        if (horas<=40){
            
            sueldo=horas*16;
            JOptionPane.showMessageDialog(null,"el sueldo total es: "+sueldo);
        }
        else{
            
            while (horas!=40){
                horas-=1;
                cont+=1;
            }
            sueldo=(horas*16)+(cont*20);
            
            JOptionPane.showMessageDialog(null,"el sueldo total es: "+sueldo);
            
        }
        
        
        
        
        
        
    }
    
}
