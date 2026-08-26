package br.com.fitlgui.lista01;

import java.util.Scanner;

// 1. Ler o nome, a idade e a altura de uma pessoa e exibir uma única frase com os três dados.
public class Atividade1 {

    public Atividade1() {
        Scanner sc = new Scanner(System.in);

        // Ler nome
        System.out.println("Digite seu nome: ");
        String name = sc.nextLine();

        sc.nextLine();

        // Ler idade
        System.out.println("Digite sua idade: ");
        int idade = sc.nextInt();

        sc.nextLine();

        // Ler Altura
        System.out.println("Digite sua Altura: ");
        double altura = sc.nextDouble();

        System.out.println("[DADOS PESSOAIS] | Nome: " + name + " | Idade: " + idade + " | Altura: " + altura);
    }
}
