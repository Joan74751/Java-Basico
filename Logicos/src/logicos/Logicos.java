/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package logicos;

/**
 *
 * @author sebas
 */
public class Logicos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Primera variable
        boolean valor1 = true;
        //Segunda variable
        boolean valor2 = true;
        //Tercera variable
        boolean valor3 = true;
        //Cuarta variable
        boolean valor4 = false;
        
        //Operador lógico: &&
        
        System.out.println("Primer resultado " + (valor1 && valor2)); //esto arroja un true. 
        System.out.println("Segundo resultado " + (valor3 && valor4));//aquí el valor será un false
        
        //Operador lógico: ||
        
        System.out.println("Tercer resultado " + (valor1 || valor2)); //Será True
        System.out.println("Cuarto resultado " + (valor1 || valor4)); //Será True
        
        //Operador lógico
        
        System.out.println("Quinto resultado " + (!valor1));//Será false
        System.out.println("Sexto resultado " + (!valor4));//Será True
    }
    
}
