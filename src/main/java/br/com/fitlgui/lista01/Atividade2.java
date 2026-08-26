package br.com.fitlgui.lista01;

import java.util.Scanner;

// 2. Ler dois números inteiros e exibir a soma, a subtração, o produto, a divisão inteira e
// o resto da divisão.

public class Atividade2 {

    public Atividade2() {
        Scanner sc = new Scanner(System.in);

        // Ler num1
        System.out.println("Digite o 1º Número: ");
        int num1 = sc.nextInt();

        // Ler num2
        System.out.println("Digite o 2º Número: ");
        int num2 = sc.nextInt();

        // Operações
        int soma = num1 + num2;
        int subtracao = num1 - num2;
        int produto = num1 * num2;
        int divisao = num1 / num2;
        int resto = num1 % num2;

        // Prints
        System.out.println("OPERAÇÕES MATEMATICAS");
        System.out.println("SOMA: " + soma);
        System.out.println("SUBTRAÇÃO: " + subtracao);
        System.out.println("PRODUTO: " + produto);
        System.out.println("DIVISÃO: " + divisao);
        System.out.println("RESTANTE: " + resto);
    }
}
