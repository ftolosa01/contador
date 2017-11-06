/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contador;

import java.util.Scanner;

public class procesoContador {

    private int contador;

    public void seta() {
        do {
         ingresar();
        } while (contador < 1 || contador > 10);
        for (int i = 0; i <= contador; i++) {
            System.out.print(" | " + i);
        }
    }

    public void ingresar() {
        Scanner intro = new Scanner(System.in);
        System.out.println("ingrese numero");
        this.contador = intro.nextInt(); 
    }
}
