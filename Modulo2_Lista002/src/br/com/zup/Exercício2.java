package br.com.zup;

import java.util.Scanner;

public class Exercício2 {
    public static void main(String[] args) {
//        Faça um programa que receba o preço de três produtos e informe qual produto
//        você deve comprar, sabendo que a decisão é sempre pelo mais barato.

        Scanner leitor = new Scanner(System.in);

//        Declarando as variáveis
        double precoProduto1;
        double precoProduto2;
        double precoProduto3;

//        Recebendo valor das variáveis
        System.out.println("Olá! Vamos verificar qual é o produto mais barato.");
        System.out.println("Informe o preço do primeiro produto: ");
        precoProduto1 = leitor.nextDouble();
        System.out.println("Informe o preço do segundo produto: ");
        precoProduto2 = leitor.nextDouble();
        System.out.println("Informe o preço do terceiro produto: ");
        precoProduto3 = leitor.nextDouble();

//        Condições para comparar
        if (precoProduto1 < precoProduto2 & precoProduto1 < precoProduto3) {
            System.out.println("Produto 1 é o mais barato.");
        }
        else if (precoProduto2 < precoProduto1 & precoProduto2 < precoProduto3) {
            System.out.println("Produto 2 é o mais barato.");
        }
        else if (precoProduto1 == precoProduto2 | precoProduto2 == precoProduto3 | precoProduto1 == precoProduto3) {
            System.out.println("Há produtos com preço igual. ");
        }
        else {
            System.out.println("Produto 3 é o mais barato.");
        }

    }
}
