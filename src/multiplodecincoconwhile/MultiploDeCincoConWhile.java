/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multiplodecincoconwhile;

/**
 *
 * @author Amarico
 */
public class MultiploDeCincoConWhile {

  /**
   * Muestra los números múltiplos de 5 de 0 a 100 utilizando un bucle while
   * 
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // TODO code application logic here
    
    //Declaro una variable de tipo entero y la inicializo con un valor de -5 para que salga el número 0
    
    int numero = -5;
    
    //Creo el bucle while
    
    while (numero < 100) {      
      
      numero = numero + 5;
      
      // Imprimo el numero por teclado
      
      System.out.println(numero);
      
    }
    
    
  }
  
}
