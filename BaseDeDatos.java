/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basededatos;

/**
 *
 * @author Thomas
 */
public class BaseDeDatos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        registroAlumno miRegistro = new registroAlumno();
        registroCiudad miRegistro2 = new registroCiudad();
        registroEstado miRegistro3 = new registroEstado();
        registroUsuario miRegistro4 = new registroUsuario();
        Clock myClock = new Clock();
        
            myClock.setVisible(true);
            
        /*miRegistro.setVisible(true);
        miRegistro2.setVisible(true);
        miRegistro3.setVisible(true);
        miRegistro4.setVisible(true);
          */  
            
        
    }
    
}
