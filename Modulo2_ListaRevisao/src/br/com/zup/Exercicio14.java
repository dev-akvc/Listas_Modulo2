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
        Scanner leitor = new Scanner(System.in);
        Map<String, String> alunos = new HashMap<String, String>();
        int numeroDeAlunos, opcaoEscolhida;
        String nomeAluno = null, telefoneAluno = null, emailAluno = null;

//        Lista inicial
        alunos.put("ka@email", "Karol, 11 1111-1111");
        alunos.put("dog@email", "Dog, 22 2222-2222");
        alunos.put("pug@email", "Pug, 33 3333-3333");

//        Menu inicial
        System.out.println("Digite a opção desejada: ");
        System.out.println("1 - Adicionar alunxs à lista");
        System.out.println("2 - Apagar alunx da lista");
        System.out.println("3 - Imprimir a lista");
        opcaoEscolhida = leitor.nextInt();

        switch (opcaoEscolhida) {
            case 1:
                System.out.println("Quer adicionar quantos alunxs? ");
                numeroDeAlunos = leitor.nextInt();

                for (int i = 1; i <= numeroDeAlunos; i++) {
                    System.out.println("Informe o e-mail do " + i + "º alunx: ");
                    emailAluno = leitor.next();
                    leitor.hasNextLine();
                    System.out.println("Informe o nome do " + i + "º alunx: ");
                    nomeAluno = leitor.next();
                    System.out.println("Informe o telefone do " + i + "º alunx: ");
                    telefoneAluno = leitor.next();
                    alunos.put(emailAluno, nomeAluno + ", " + telefoneAluno);
                    leitor.hasNextLine();
                }


//        for (String chaveAluno : alunos.keySet()) {
//            System.out.println("Aluno: " + alunos.get(chaveAluno) + " E-mail: " + chaveAluno);
//
//            for (String verificarEmail : alunos.keySet()) {
//                if (verificarEmail.equals(emailAluno)) {
//                    System.out.println("Este e-mail já foi cadastrado.");
//                } else {
//                    alunos.put(emailAluno, nomeAluno + ", " + telefoneAluno);
//                    System.out.println("E-mail cadastrado com sucesso.");
//                }
//            }
//        }
        break;

        case 2:
        System.out.println("Qual alunx deseja apagar? Informe o e-mail delx: ");
        emailAluno = leitor.next();
        System.out.println("Aluno deletado com sucesso.");
        alunos.remove(emailAluno);
        for (String chaveAluno : alunos.keySet()) {
            System.out.println("Aluno: " + alunos.get(chaveAluno) + " E-mail: " + chaveAluno);
        }
        break;

        case 3:
        for (String chaveAluno : alunos.keySet()) {
            System.out.println("Aluno: " + alunos.get(chaveAluno) + " E-mail: " + chaveAluno);
        }
        break;

        default:
        System.out.println("Digite uma opção válida.");
        break;
    }


}
}
