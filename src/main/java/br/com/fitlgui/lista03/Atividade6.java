package br.com.fitlgui.lista03;

import java.util.Scanner;

// 6. Calcular o fatorial com um acumulador usando for.
public class Atividade6 {
    public Atividade6() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número inteiro não negativo: ");
        int numero = sc.nextInt();

        if (numero < 0) {
            System.out.println("Entrada inválida.");
            return;
        }

        long fatorial = 1;
        for (int i = 2; i <= numero; i++) fatorial *= i;
        System.out.println("Fatorial: " + fatorial);
    }
}
