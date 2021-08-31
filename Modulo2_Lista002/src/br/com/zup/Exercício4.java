package br.com.zup;

import java.util.Scanner;

public class Exercício4 {
    public static void main(String[] args) {
//        Cálculo do aumento salarial

//        Instanciando o scanner
        Scanner leitor = new Scanner(System.in);

//        Declarando as variáveis
        double salarioAtual;
        double percentualDeAumento =0;
        double aumentoSalarial;
        double salarioComAumento;

//        Recebendo valor das variáveis

        System.out.println("Olá! Vamos calcular seu aumento salarial.");
        System.out.println("Por favor, informe o salário atual: ");
        salarioAtual = leitor.nextDouble();

        if (salarioAtual >0 & salarioAtual <=280) {
        percentualDeAumento = 0.2;
        }
        else if (salarioAtual >280 & salarioAtual <=700) {
            percentualDeAumento = 0.15;
        }
        else if (salarioAtual>700 & salarioAtual<=1500){
            percentualDeAumento = 0.1;
        }
        else if (salarioAtual>1500){
            percentualDeAumento = 0.05;
        }
        else {
            System.out.println("Por favor, digite um salário válido");
            return;
        }

        aumentoSalarial = salarioAtual * percentualDeAumento;
        salarioComAumento = salarioAtual + aumentoSalarial;
        System.out.println("Seu salário atual é R$" +salarioAtual);
        System.out.println("Seu percentual de aumento é de: " +percentualDeAumento*100+ "%.");
        System.out.printf("Portanto, seu aumento será de R$ %.2f\n" ,aumentoSalarial);
        System.out.printf("Então, seu novo salário será de R$ %.2f",+salarioComAumento);






    }
}
