package br.com.zup;

import java.util.Scanner;
import java.util.ArrayList;

public class Exercicio8 {
    public static void main(String[] args) {
/*
Faça um Programa que leia uma lista de 5 números inteiros e mostre-os.
 */
//        Instanciando Scanner
        Scanner leitor = new Scanner(System.in);

//        Declarando variáveis
        int numeroRecebido = 0;
        ArrayList<Integer> listaDeNumeros = new ArrayList();

        System.out.println("Informe 5 números inteiros (sem casas decimais): ");


        for (int i = 1; i <= 5; i++) {
            numeroRecebido = leitor.nextInt();
            listaDeNumeros.add(numeroRecebido);
        }


        System.out.println("Os números informados foram: " +listaDeNumeros);
    }

}
