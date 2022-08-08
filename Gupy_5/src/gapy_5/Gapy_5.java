/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package gapy_5;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Gapy_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        5) Escreva um programa que inverta os caracteres de um string.

IMPORTANTE:
a) Essa string pode ser informada através de qualquer entrada de sua preferência ou pode ser 
previamente definida no código;
b) Evite usar funções prontas, como, por exemplo, reverse;
        
        String s = "TEXTO"; String invertida = ""; for (int i = s.length(); i < 0; i++) { invertida += s.charAt(i); } 
        System.out.println(invertida);
         */

        Scanner read = new Scanner(System.in);

        System.out.println("Digite uma palavra");
        String entrada = read.next();
        String invertida = "";

        for (int i = entrada.length() - 1; i >= 0; i--) {
            invertida += entrada.charAt(i);
        }
        System.out.println(invertida);

    }

}
