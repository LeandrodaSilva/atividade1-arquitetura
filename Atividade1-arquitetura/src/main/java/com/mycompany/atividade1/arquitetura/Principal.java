/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.atividade1.arquitetura;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import java.util.List;

/**
 *
 * @author Aluno
 */
public class Principal {

    /**
     * Código anterior: static String aux;
     *
     * Requisito: nome de variáveis compreensíveis
     *
     * Novo código linha 30:
     */
    static String entradaDoUsuario;
    static List<Aluno> listaDeAlunos = new ArrayList<Aluno>();
    static Scanner read = new Scanner(System.in);
    /**
     * requisito: quebra de complexidade oque foi feito: a listagem de alunos
     * foi simplificada então a variavel abaixo não é mais utilizada.
     */
    static int opcao = 0, /*cont = 0,*/ verif = 0;

    public static void main(String[] args) {
        /**
         * Código anterior:
         *
         *
         * int opcao = 0, cont = 0, verif = 0; String aux; String[] alunos = ;
         * ArrayList<String> alunos = new ArrayList(); Scanner read = new
         * Scanner(System.in);
         *
         * Requisito: utilizar melhor as variáveis existentes.
         *
         * Novo código: linha 30 - 38
         */

        while (opcao != 3) {
            System.out.println("Bem vindo ao sistema de ...");
            System.out.println("Escolha uma opção: ");
            System.out.println("[1] Cadastrar aluno");
            System.out.println("[2] Listar alunos cadastrados");
            System.out.println("[3] Sair");

            opcao = Integer.parseInt(read.nextLine());

            switch (opcao) {
                case 1:
                    /**
                     * Código anterior: System.out.println("Digite o nome do
                     * aluno: "); aux = read.nextLine(); Iterator itr1 =
                     * alunos.iterator(); while(itr1.hasNext()) { Object
                     * elemento = itr1.next(); if (elemento.equals(aux)) {
                     * System.out.println("Aluno já cadastrado"); verif++; } }
                     * if (verif == 0) { alunos.add(aux); }
                     *
                     * Requisito: divisão do codigo em métodos
                     *
                     * Novo código linha 87:
                     */
                    cadastrarAluno();
                    break;
                case 2:
                    /**
                     * Código anterior:
                     *
                     * Iterator itr2 = alunos.iterator(); while(itr2.hasNext())
                     * { Object elemento = itr2.next();
                     * System.out.println(elemento); }
                     *
                     * Requisito: divisão do codigo em métodos
                     *
                     * Novo código linha 103:
                     */
                    listarAluno();
                    break;
            }
        }
    }

    //divisão do codigo em métodos.
    private static void cadastrarAluno() {
        System.out.println("Digite o nome do aluno: ");
        entradaDoUsuario = read.nextLine();
        Iterator itr1 = listaDeAlunos.iterator();
        while (itr1.hasNext()) {
            Object elemento = itr1.next();
            if (elemento.equals(entradaDoUsuario)) {
                System.out.println("Aluno já cadastrado");
                verif++;
            }
        }
        if (verif == 0) {
            listaDeAlunos.add(new Aluno(entradaDoUsuario));
        }
    }

    private static void listarAluno() {
        /**
         * Código anterior : Iterator itr2 = alunos.iterator();
         * while(itr2.hasNext()) { Object elemento = itr2.next();
         * System.out.println(elemento); }
         * Requisito: quebra de complexidade
         * Novo código:
         */
        for (Aluno aluno : listaDeAlunos) {
            System.out.println(aluno.getNome());
        }
    }
}
