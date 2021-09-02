package br.com.zup;

import jdk.swing.interop.SwingInterOpUtils;

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
        int numeroDeAlunos, opcaoEscolhida;
        String nomeAlunoETelefone, emailAluno;

//        Lista inicial
        alunos.put("ka@email","Karol, 11 1111-1111");
        alunos.put("dog@email","Dog, 22 2222-2222");
        alunos.put("pug@email","Pug, 33 3333-3333");

//        Menu inicial
        System.out.println("Digite a opção desejada: ");
        System.out.println("1 - Adicionar alunxs à lista");
        System.out.println("2 - Apagar alunx da lista");
        System.out.println("3 - Imprimir a lista");
        opcaoEscolhida = leitor.nextInt();

        switch (opcaoEscolhida){
            case 1:
                System.out.println("Quer adicionar quantos alunxs? ");
                numeroDeAlunos = leitor.nextInt();

                for (int i = 1; i <= numeroDeAlunos; i++) {
                    System.out.println("Informe o e-mail do " +i+ "º alunx: ");
                    emailAluno = leitor.next();
                    leitor.hasNextLine();
                    System.out.println("Informe o nome e telefone do " +i+ "º alunx, separados por ; : ");
                    nomeAlunoETelefone = leitor.next();
                    alunos.put(emailAluno, nomeAlunoETelefone);
                    leitor.hasNextLine();
                }
                System.out.println("Lista atualizada: " +alunos);
                break;

            case 2:
                System.out.println("Qual alunx deseja apagar? Informe o e-mail delx: ");
                emailAluno = leitor.next ();
                alunos.remove(emailAluno);
                System.out.println("Lista atualizada: " +alunos);
                break;

            case 3:
                System.out.println("A lista de alunxs é: " +alunos);
                break;
        }










    }
}
