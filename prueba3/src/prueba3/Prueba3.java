/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prueba3;

import java.util.Scanner;

/**
 *
 * @author A286931
 */
public class Prueba3 {

    /**
     * @param args the command line arguments
     */
  public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String nombre;
        System.out.println("Ingrese su nombre por favor:");
        nombre = leer.next();
        System.out.println("Gracias, " + nombre + " , hasta luego.");
    }
}
