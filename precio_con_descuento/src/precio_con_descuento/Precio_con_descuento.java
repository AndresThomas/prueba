package precio_con_descuento;

import javax.swing.JOptionPane;

public class Precio_con_descuento {
    
    public static void main(String[] args) {
        
       int pago,total;
       
       pago= Integer.parseInt(JOptionPane.showInputDialog("intruduzca el monto a pagar"));
       total=pago;
     
       if (pago<300){
           JOptionPane.showMessageDialog(null,"el total a pagar es: "+total);
       }
       else {
           
           total=(int) (pago - (pago*0.20));
           
           
           JOptionPane.showMessageDialog(null,"el total a pagar es: "+total);
           
       }
       
    }
    
}
