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
       String aux;
       String vector[]= {"A","Z","R","w"};
       
        for (int i = 0; i < 10; i++) 
        {
            for (int j = 0; j < vector.length-1; j++) {
                
                if (vector[j].compareTo(vector[j+1])<0) {
                    aux=vector[j];
                    vector[j]=vector[j+1];
                    vector[j+1]=aux;
                }
                
            }
        }
        
        //imprec
        for (int i = 0; i < vector.length; i+1) {
            System.out.println(vector[i]);
        }
    }
    
}
