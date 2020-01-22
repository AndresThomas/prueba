package cajero_automatico;

import javax.swing.JOptionPane;

public class Cajero_automatico {

    public static void main(String[] args) {
        
        final int saldo_inicial=1000;
        int opcion;
        float deposito,saldo,retiro;
        opcion=Integer.parseInt(JOptionPane.showInputDialog("Cajero vegas \n"
        +"1 para ingresar dinero a la cuentan\n"
        +"2 para retirar diner de la cuentan\n"
        + "3 para salir"));
        
        switch (opcion){
            
            case 1: 
                deposito=Float.parseFloat(JOptionPane.showInputDialog("ingrese la cantidad a depositar"));
                saldo=saldo_inicial + deposito;
                JOptionPane.showMessageDialog(null,"dinero en cuenta: "+saldo); // eres tonto?
                break;
            case 2:
                retiro=Float.parseFloat(JOptionPane.showInputDialog("ingrese la cantidad a retiar"));
                if (retiro>saldo_inicial){
                    JOptionPane.showMessageDialog(null,"no se puede realizar la accion "); // eres tonto
                }
                else{
                    saldo=saldo_inicial - retiro;
                    JOptionPane.showMessageDialog(null,"dinero en cuenta"+ saldo);
                }
                break;
            case 3: break;
            default: JOptionPane.showMessageDialog(null, "no se puede hacer, eres tonto?");
            
        }
        
        
    }
    
}
