package br.com.zup;

import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        /*
        Faça um programa para ler uma quantidade de números (N)
        digitada pelo usuário e mostrar a quantidade de números pares desses números.
         */

//        Instanciando Scanner
        Scanner leitor = new Scanner(System.in);

//        Declarando as variáveis
        double numeroRecebido = 0;
        int contador = 1;
        int qtdeDeNumeros = 0;
        int numerosPares = 0;

//        Recebendo números
        System.out.println("Olá, quantos números deseja verificar?");
        qtdeDeNumeros = leitor.nextInt();

        while (contador <= qtdeDeNumeros){
            System.out.println("Informe o " +contador+ "º número");
            numeroRecebido = leitor.nextDouble();

            if (numeroRecebido %2 == 0) {
                numerosPares +=1;
            }


            contador +=1;
        }
        System.out.println("A quantidade de número pares é: " +numerosPares);
    }
}
