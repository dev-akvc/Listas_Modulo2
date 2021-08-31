package br.com.zup;

import java.util.Scanner;

public class Exercício2 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

//        Declarar as variáveis
        double nota1;
        double nota2;
        double nota3;
        double nota4;
        double soma;
        double media;

//        Receber valor das variáveis
        System.out.println("Olá, vamos calcular a média das notas. Por favor, informe");
        System.out.println("Nota 1: ");
        nota1 = leitor.nextDouble();

        System.out.println("Nota 2: ");
        nota2 = leitor.nextDouble();

        System.out.println("Nota 3: ");
        nota3 = leitor.nextDouble();

        System.out.println("Nota 4: ");
        nota4 = leitor.nextDouble();

//        Processar os dados
        soma = nota1+nota2+nota3+nota4;
        media = soma/4;

//        Exibir a média
        System.out.println("A soma das notas é: " +soma+ ". Portanto a média é: " +media);

    }
}
