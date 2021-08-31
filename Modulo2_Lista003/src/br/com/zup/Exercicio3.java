package br.com.zup;

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
//        Instanciando o scanner
        Scanner leitor = new Scanner(System.in);

//        Declarando as variáveis
        int contadorDeRespostas = 0;

        // Perguntas da investigação
        System.out.println("Como parte da investigação te farei algumas perguntas. ");
        System.out.println("Responda S para Sim ou N para Não");

        // Perguntas
        System.out.println("Telefonou para a vítima?");
        String resposta = leitor.nextLine();
        if (resposta.equals("S")) {
            contadorDeRespostas += 1;
        }

        System.out.println("Esteve no local do crime?");

        resposta = leitor.nextLine();
        if (resposta.equals("S")) {
            contadorDeRespostas += 1;
        }

        System.out.println("Mora perto da vítima?");

        resposta = leitor.nextLine();
        if (resposta.equals("S")) {
            contadorDeRespostas += 1;
        }

        System.out.println("Devia para a vítima?");

        resposta = leitor.nextLine();
        if (resposta.equals("S")) {
            contadorDeRespostas += 1;
        }

        System.out.println("Já trabalhou com a vítima?");

        resposta = leitor.nextLine();
        if (resposta.equals("S")) {
            contadorDeRespostas += 1;
        }

        switch (contadorDeRespostas) {

            case 2:
                System.out.println("Você é Suspeito do crime.");
                break;

            case 3:
                System.out.println("Você é cúmplice do crime");
                break;

            case 4:
                System.out.println("Você é cúmplice do crime");
                break;

            case 5:
                System.out.println("Você é o assassino! Você está preso.");
                break;

            default:
                System.out.println("Você é inocente. Me perdoe o incômodo");
                break;
        }


    }

}
