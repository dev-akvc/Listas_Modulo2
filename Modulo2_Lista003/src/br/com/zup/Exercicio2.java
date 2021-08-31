package br.com.zup;

import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
//        Instanciando Scanner
        Scanner leitor = new Scanner(System.in);

//        Declarando variáveis
        char combustivel;
        double desconto = 0;
        double valorInicial = 0;
        double valorPago, qtdDelitros;

//        Recebendo dados
        System.out.println("Informe o combustível que será utilizado:\nA-Álcool\nG-Gasolina ");
        combustivel = leitor.next().toUpperCase().charAt(0);
        System.out.println("Foram abastecidos quantos litros?");
        qtdDelitros = leitor.nextDouble();

//        Condições para cálculo
        if (combustivel=='A') {
            valorInicial = qtdDelitros * 1.9;
            if (qtdDelitros>0 & qtdDelitros<=20){
                desconto = .03;
            }
            else if (qtdDelitros>20) {
                desconto = .05;
            }
        }
        else if (combustivel=='G') {
            valorInicial = qtdDelitros * 2.5;
            if (qtdDelitros>0 & qtdDelitros<=20){
                desconto = .04;
            }
            else if (qtdDelitros>20){
                desconto = .06;
            }
        }
        else {
            System.out.println("Digite uma opção válida.");
        }

//        Exibindo resultado
        valorPago = valorInicial - (valorInicial * desconto);
        System.out.printf("O valor total é R$ %.2f %n", valorInicial);
        System.out.printf("Com desconto, o valor devido é R$ %.2f" ,valorPago);

    }
}
