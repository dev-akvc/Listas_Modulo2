package br.com.zup;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio9 {
    public static void main(String[] args) {
/*
Faça um Programa que leia uma lista de 10 números e mostre-os na ordem inversa.
 */
//        Instanciando Scanner
        Scanner leitor = new Scanner(System.in);

//        Declarando variáveis
        int numeroRecebido = 0;
        ArrayList<Integer> listaDeNumeros = new ArrayList();

        System.out.println("Informe 10 números: ");

        for (int i = 0; i < 10; i++) {
            numeroRecebido = leitor.nextInt();
            listaDeNumeros.add(numeroRecebido);


        }

        System.out.println("E os números informados foram: " +listaDeNumeros.indexOf(10));
    }
}
