/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package gupy;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Gupy {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        2) Dado a sequência de Fibonacci, onde se inicia por 0 e 1 e o próximo valor sempre será a soma dos 2 valores anteriores (exemplo: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34...), escreva um programa na linguagem que desejar onde, informado um número, ele calcule a sequência de Fibonacci e retorne uma mensagem avisando se o número informado pertence ou não a sequência.

IMPORTANTE:
Esse número pode ser informado através de qualquer entrada de sua preferência ou pode ser previamente definido no código;
         */

        Scanner read = new Scanner(System.in);
        int n1 = 1;
        int n2 = 0;

        System.out.println("Informe um numero para calcular a Seguencia Fibonacci: ");
        int numero = read.nextInt();

        for (int i = 1; i <= numero; i++) {
            if (i < 2) {

                System.out.print(1 + " ");

            } else {
                n1 = n1 + n2;
                n2 = n1 - n2;

                System.out.print(n1 + " ");
            }
        }
        System.out.println("");
        if (numero == n1) {
            System.out.println("Pertence a seguencia Fibonacci!");

        } else {
            System.out.println("Este número não pertence a seguência Fibonacci.");
        }
    }

}
