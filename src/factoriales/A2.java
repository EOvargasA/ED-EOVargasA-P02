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
public class A2 {
    public static int factorial (int n){
        if (n == 0){
            return 1;
        }else{
            return n*factorial(n-1);
        }
    }
    
    public static int sumaVector (int[] a, int n){
        if (n == 0){
            return a[n];
        }else{
            return a[n] + sumaVector (a, n - 1);
        }
    }
    
    public static int multiplicaVector (int[] a, int n){
        if (n == 0){
            return a[n];
        }else{
            return a[n] * multiplicaVector (a, n - 1);
        }
    }
}
