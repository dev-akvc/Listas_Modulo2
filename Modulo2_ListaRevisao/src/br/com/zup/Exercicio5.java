package br.com.zup;

import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
/*
Faça um programa que leia 5 números e informe o maior número.
 */
//        Instanciando Scanner
        Scanner leitor = new Scanner(System.in);

//        Declarando variáveis
        int numeroRecebido, maiorValor = 0;

        System.out.println("Vamos comparar 5 números.");

        for (int i = 1; i <= 5; i++) {
            System.out.println("Informe o " +i+ "ª número: ");
            numeroRecebido = leitor.nextInt();

            if (i == 1){
                maiorValor = numeroRecebido;
            }
            else {
                if (numeroRecebido >= maiorValor){
                    maiorValor = numeroRecebido;
                }

            }
        }
        System.out.println("O maior número é: " +maiorValor);


    }
}
