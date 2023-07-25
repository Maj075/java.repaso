/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;

/**
 *
 * @author maria
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n = 20;
        imprimirNumerosPares(n);
    }
    
    public static void imprimirNumerosPares(int n) {
        System.out.println("Números pares del 1 al " + n + ":");
        
        // Utilizamos un for para iterar desde 1 hasta n
        for (int i = 1; i <= n; i++) {
            // Utilizamos un if para verificar si el número es par
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
        
        // Utilizamos un while para imprimir los primeros 5 números pares adicionales
        int contador = 1;
        while (contador <= 5) {
            System.out.print((n + contador * 2) + " ");
            contador++;
        }
    }
}

}
    
}
