/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lista;

import java.util.ArrayList;
import java.util.List;



/**
 *
 * @author sebas
 */
public class Lista {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       /* int notas[] = new int[5];
        
        notas[0] = 4;
        notas[1] = 5;
        notas[2] = 6;
        notas[3] = 7;
        notas[4] = 8;
        
        System.out.println("El numero es: " + notas[2]);*/
       
       /*int notas[] = {5,6,7,8,9};
       
       for(int f = 0; f < notas.length; f++){
           System.out.println("NOtas: " + notas[f]);
       }*/
       
       
       /*arreglos multidimensionales
       int[][] numeros = new int[3][3];
       int f, j; 
       
        for (f = 0; f <numeros.length; f++) {
            System.out.println();
            
            for (j = 0; j < numeros.length; j++) {
                System.out.print(numeros[f][j] + " ");
                
                
            }
            
        }
       
       int [][] matriz = new int[2][3];
       matriz[0][0] = 45;
       matriz[0][1] = 4;
       matriz[1][0] = 78;
       matriz[1][1] = 65;
       
       int filas, columnas;
       
        for ( filas = 0; filas < matriz.length; filas++) {
            System.out.println();
            
            for (columnas = 0; columnas < matriz.length; columnas++) {
                System.out.print(matriz[filas][columnas] + " ");
            }
        }*/
       
      /* List<String> animales = new ArrayList<>();
       
       animales.add("Leon");
       animales.add("Jaguar");
       animales.add("Gato");
       animales.add("Vaca");
       
        System.out.println(animales +" ");
        
        animales.add(1, "Puma");
        
        System.out.println(animales +" ");*/
      
      List<String> lenguaje = new ArrayList<>();
      
      lenguaje.add("Python");
      lenguaje.add("C++");
      lenguaje.add("Java");
      lenguaje.add("Ruby");
      
        System.out.println(lenguaje);
        
        lenguaje.remove(2);
        
        System.out.println(lenguaje);
       
    }
    
}
