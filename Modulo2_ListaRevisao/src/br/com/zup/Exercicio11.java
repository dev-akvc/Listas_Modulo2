package br.com.zup;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args) {
/*
Faça um Programa que leia 20 números e armazene-os numa lista.
Armazene os números pares na lista PAR e os números ÍMPARES na lista ímpar.
Imprima as três listas.
 */
//        Instanciando Scanner
        Scanner leitor = new Scanner (System.in);

//        Declarando variáveis
        int numeroRecebido;
        ArrayList<Integer> listaDeNumeros = new ArrayList();
        ArrayList<Integer> numerosPares = new ArrayList();
        ArrayList<Integer> numerosImpares = new ArrayList();

        System.out.println("Olá! Me informe 20 números: ");


        for (int i = 1; i <= 20; i++) {
            numeroRecebido = leitor.nextInt();
            listaDeNumeros.add(numeroRecebido);
            if (numeroRecebido %2 == 0){
                numerosPares.add(numeroRecebido);
            }
            else {
                numerosImpares.add(numeroRecebido);
            }
        }
        System.out.println("Os números recebidos foram: " +listaDeNumeros);
        System.out.println("Destes, são pares: " +numerosPares);
        System.out.println("E ímpares: " +numerosImpares);

    }
}
