package br.com.fitlgui.lista01;

import java.util.Scanner;

// 9. Ler um número inteiro e informar se ele é par ou ímpar.
public class Atividade9 {
    public Atividade9() {
        Scanner sc = new Scanner(System.in);

        // Variaveis
        int num = 0;

        System.out.println("Digite um numero: ");
        sc.nextInt();

        System.out.println("SEU NÚMERO É: " + ((num % 2 == 0) ? "PAR" : "IMPAR"));
    }
}
