/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package gupy_4;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Gupy_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
 4) Dado o valor de faturamento mensal de uma distribuidora, detalhado por estado:

SP – R$67.836,43
RJ – R$36.678,66
MG – R$29.229,88
ES – R$27.165,48
Outros – R$19.849,53

Escreva um programa na linguagem que desejar onde calcule o percentual de representação que cada estado teve 
dentro do valor total mensal da distribuidora.
         */
        
        Scanner read = new Scanner(System.in);

        double valor[] = new double[5];
        double soma = 0;
        double percentual[] = new double[5];
        String estado[] = new String[5];
        

        System.out.println("Informe o valor de faturamento mensal da distribuidora X por estado: ");

        System.out.println("===============================================================");

        for (int i = 0; i < 5; i++) {

            System.out.print("Estado: ");
            estado[i] = read.next();
            System.out.print("Valor: ");
            valor[i] = read.nextDouble();

            soma += valor[i];
        }
        System.out.println("===============================================================");

        for (int i = 0; i < 5; i++) {
            percentual[i] = Math.round((valor[i] * 100) / soma);
        }

        for (int i = 0; i < 5; i++) {
            System.out.println("Estado : " + estado[i] + "  Percentual: " + percentual[i] +"%");
        }

    }

}
