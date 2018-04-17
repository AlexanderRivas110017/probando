package practica;

import javax.swing.JOptionPane;

/**
 *Nombre de la clase: Practica
 * Fecha: 17-04-2018
 * Version: 1.0
 * Copyrigth: Alexander Rivas
 * @author Alexander Rivas
 */
public class Practica {

    public static void main(String[] args) {
       int aux;
       int vector[]= {2,5,7,4,5,6,8,7};
       
        for (int j = 1; j < 3; j++) 
        {
            for (int i =0; i <vector.length; i++) 
            {
                if (vector[i]>vector[i+1]) 
                {
                    aux=vector[i];
                vector[i]=vector[i+1];
                vector[i+1]=aux;
                }
                
            }
        }
        
        //imprecion
      
    }
    
}
