package br.com.zup;

import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
/*
Faça um programa que pergunte o preço de três produtos
e informe qual produto você deve comprar, sabendo que a decisão é sempre pelo mais barato.
 */
//        Instanciando Scanner
        Scanner leitor = new Scanner(System.in);

//        Declarando variáveis
        double preco1, preco2, preco3 = 0;

        System.out.println("Vamos comparar os valores.");
        System.out.println("Digite o valor do 1º produto");
        preco1 = leitor.nextDouble();
        System.out.println("Digite o valor do 2º produto");
        preco2 = leitor.nextDouble();
        System.out.println("Digite o valor do 3º produto");
        preco3 = leitor.nextDouble();

        if (preco1 < preco2 & preco1 < preco3){
            System.out.println("Produto 1 é o mais barato.");
        }
        else if (preco2 < preco1 & preco2 < preco3) {
            System.out.println("Produto 2 é o mais barato.");
       }
        else if (preco3 < preco1 & preco3 < preco2){
            System.out.println("Produto 3 é o mais barato.");
        }
        else {
            if(preco1 == preco2) {
                System.out.println("Produto 1 e 2 têm o mesmo valor.");
            }
            if (preco2 == preco3) {
                System.out.println("Produto 2 e 3 têm o mesmo valor.");
            }
            if (preco1 == preco3) {
                System.out.println("Produto 1 e 3 têm o mesmo valor.");
            }
        }

    }
}
