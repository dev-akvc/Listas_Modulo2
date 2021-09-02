package br.com.zup;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class Exercicio14 {
    public static void main(String[] args) {
/*
Crie um programa para gerenciar uma lista de alunos, cada aluno tem nome, telefone e email.
No final do programa deve ser exibido a lista de alunos cadastrados.
Entrega Mínima: O sistema permite, via terminal, inserir pelo menos 1 aluno em uma lista
e retornar o mesmo na tela.
Entrega Média: O sistema permite adicionar mais de um aluno e apresenta um menu para decidir
se deverá adicionar mais alunos ou encerrar o programa.
Entrega Máxima: O Sistema permite excluir um aluno usando como parâmetro o email
e não permite inserir um aluno com o email repetido.
 */
//        Instanciando Scanner
        Scanner leitor = new Scanner (System.in);
        Map<String,String> alunos = new HashMap<String,String>();

//        Para adicionar itens à lista
        alunos.put("ka@email","Karol, 11 1111-1111");
        alunos.put("dog@email","Dog, 22 2222-2222");
        alunos.put("pug@email","Pug, 33 3333-3333");

        System.out.println(alunos.get("dog@email"));


    }
}
