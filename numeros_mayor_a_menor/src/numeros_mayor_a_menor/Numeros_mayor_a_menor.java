package numeros_mayor_a_menor;

import javax.swing.JOptionPane;

public class Numeros_mayor_a_menor {

    public static void main(String[] args) {
        
        int num1,num2,num3;
        
        num1=Integer.parseInt(JOptionPane.showInputDialog(null,"ingrese un numero" ));
        num2=Integer.parseInt(JOptionPane.showInputDialog(null,"ingrese un numero"));
        num3=Integer.parseInt(JOptionPane.showInputDialog(null,"ingrese un numero"));
        
        if (num1>num2&&num1>num3&&num2>num3)   {
            
            JOptionPane.showMessageDialog(null,"el oreden es: "+num1+" "+num2+" "+num3 );
            
        }
        
        if (num2>num1&&num2>num3&&num1>num3){
            JOptionPane.showMessageDialog(null,"el orden es: "+num2+" "+num1+" "+num3);
        }
        
        if (num3>num1&&num3>num2&&num1>num2){
            JOptionPane.showMessageDialog(null,"el orden es: "+num3+" "+num1+" "+num2);
        }
        
        if(num3>num1&&num3>num2&&num2>num1 ){
            JOptionPane.showMessageDialog(null,"el orden es: "+num3+" "+num2+" "+num1);
        }
        
        if (num1>num2&&num1>num3&&num3>num2)   {
            
            JOptionPane.showMessageDialog(null,"el oreden es: "+num1+" "+num3+" "+num2 );
            
        }        
         if (num2>num1&&num2>num3&&num3>num1){
            JOptionPane.showMessageDialog(null,"el orden es: "+num2+" "+num3+" "+num1);
        }
    }
    
}
