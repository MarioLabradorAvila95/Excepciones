/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excepciones;
/**
 *
 * @author mario
 */
import java.awt.*;
import java.util.*;
import java.io.*;

public class Excepciones {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) { 
        
        StackOverflowError();
        //NoClassDefFoundErrorExample();
        //NumberFormatException();
        //ClassCastException();
        //NullPointerException();
        //ArithmeticException();
        
    }
    
       /* public static  void ArrayIndexOutOfBoundsException(){
       
        int [] array = new int[20];
		         try
		         {
			         array[-3] = 24;	
		         }
		         catch(ArrayIndexOutOfBoundsException excepcion)
		         {
			         System.out.println(" Error de índice en un array");
		         }
	         }*/
       
        
    
    
       /* public static  void NumberFormatException(){
       
            try {
                String srt = " 12";
                int numero = Integer.parseInt(srt);
            } 
            catch (NumberFormatException e) {
                System.out.println(" Error en conversion de formato");
            }
        
       
        
    }*/

    
        /*public static  void NoClassDefFoundErrorExample(){
           
            System.out.println(" a new instance of the test clas was created!");
        
    }*/
    
        public static  void StackOverflowError(){
       
            try {
                StackOverflowError();
            } catch (Exception e) {
                System.out.println("");
            }
       
        
    }
    
       /* public static  void ExceptionInInitializerError(){
       
       
       
        
    }*/
    
        /*public static  void ClassCastException(){
       
        try {
            Object i = Integer.valueOf(42);
            String s = (String)i;
        } 
        catch (ClassCastException e) {
            System.out.println("Ha intentado convertir un objeto a una subclase de la que no es una instancia.");
        }
       
        
    }*/
    
        /*public static  void ClassCastException(){
       
        try {
            Object i = Integer.valueOf(42);
            String s = (String)i;
        } 
        catch (ClassCastException e) {
            System.out.println("Ha intentado convertir un objeto a una subclase de la que no es una instancia.");
        }
       
        
    }*/
   
    
    /*public static  void ClassCastException(){
       
        try {
            Object i = Integer.valueOf(42);
            String s = (String)i;
        } 
        catch (ClassCastException e) {
            System.out.println("Ha intentado convertir un objeto a una subclase de la que no es una instancia.");
        }
       
        
    }*/
    
    /* public static  void NullPointerException(){
        
        try {
            String cadena = null;        
            cadena.charAt(4);
        } 
        catch (NullPointerException e) {
            System.out.println("La cadena no debe ser null");
            
        }
        
    }*/
    
    
    /*public static  void ArithmeticException(){
        
        try {
            
            int i = 5;
            i = i/0;
            
        } 
        catch (ArithmeticException e) {
            System.out.println("Error en division");
            e.printStackTrace();
        }
    }*/

}