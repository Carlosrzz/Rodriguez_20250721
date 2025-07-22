/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package rodriguez_20250721;

/**
 *
 * @author UFG
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("50 grados centigrados a Farentheit:" + Celsius_a_fahrenheit() + "F");
         System.out.println("50 grados centigrados a Kelvin:" + Celsius_a_Kelvin() + "K");
         System.out.println("50 grados centigrados a Rankine:" + Celsius_a_Rankine() + "R");
         System.out.println("50 grados Farentheit a centigrados:" + fahrenheit_a_Celsius () + "C");
         System.out.println("50 grados farenheit a Kelvin:" + fahrenheit_a_Kelvin () + "K");
    }
    
    
    
    public static double Celsius_a_fahrenheit(){
        double grados_centigrados = 50.0;
        return ((grados_centigrados * 9) /5) + 32;
    }
        
      public static double Celsius_a_Kelvin(){
        double grados_centigrados = 50.0;
        return grados_centigrados +273.15;
    }   
        
      public static double Celsius_a_Rankine(){
        double grados_centigrados = 50.0;
        return ((grados_centigrados * 9)/5) + 491.67;
    }   
      
          public static double fahrenheit_a_Celsius(){
        double grados_centigrados = 30.0;
        return ((grados_centigrados -32)* 5)/9;
    }   
          
        public static double fahrenheit_a_Kelvin(){
        double grados_centigrados = 30.0;
        return ((grados_centigrados -32)* 5)/9 +273.15;
    }   
}
