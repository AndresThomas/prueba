package ClasesyObjetos;

public class Coche {
    
    //Atributos 
    
    String color;
    String marca;
    int km;
    
    //Metodo
    public static void main(String [] args){
    
        Coche coche1= new Coche();
        Coche coche2= new Coche();
        coche1.color="Negro";
        coche1.marca="ferrari";
        coche1.km=00;
        
        System.out.println("el color del coche 1 es: "+coche1.color);
        System.out.println("la marca del coche 1 es: "+coche1.marca);
        System.out.println("el kilometraje del coche 1 es: "+coche1.km);
        
        //coche 2
        
        coche2.color="rojo";
        coche2.marca="una bien vergaz :v";
        coche2.km=0;
         
        System.out.println("\n el color del coche 2 es: "+coche2.color);
        System.out.println("la marca del coche 2 es: "+coche2.marca);
        System.out.println("el kilometraje del coche 2 es: "+coche2.km);
        
        
}
    
}
