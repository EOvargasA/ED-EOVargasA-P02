/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factoriales;

/**
 *
 * @author Osiris
 */
public class Factoriales {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] numeros={2, 4, 15, 25};
        System.out.println(A2.factorial(5));
        System.out.println(A2.sumaVector(numeros, numeros.length - 1));
        System.out.println(A2.multiplicaVector(numeros, numeros.length - 1));
    }
}
