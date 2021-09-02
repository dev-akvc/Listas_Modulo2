package br.com.zup;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio12 {
    public static void main(String[] args) {
/*
Faça um Programa que leia uma lista de 5 números inteiros,
mostre a soma, a multiplicação e os números.
 */
//        Instanciando Scanner
        Scanner leitor = new Scanner(System.in);

//        Declarando variáveis
        int numeroRecebido = 0, soma = 0, multiplicacao = 1;
        ArrayList<Integer> listaDeNumeros = new ArrayList();

        System.out.println("Informe 5 números inteiros (sem casas decimais): ");

        for (int i = 0; i < 5; i++) {
            numeroRecebido = leitor.nextInt();
            listaDeNumeros.add(numeroRecebido);

            soma += listaDeNumeros.get(i);
            multiplicacao *= listaDeNumeros.get(i);
        }

        System.out.println("A soma dos números informados é: " +soma);
        System.out.println("A multiplicação é: " +multiplicacao);
        System.out.println("E os números informados foram: " +listaDeNumeros);
    }
}
