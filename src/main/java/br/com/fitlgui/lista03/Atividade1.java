package br.com.fitlgui.lista03;

import java.util.Scanner;

// 1. Ler N e imprimir de 1 até N usando while.
public class Atividade1 {
    public Atividade1() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite N: ");
        int n = sc.nextInt();

        if (n < 1) {
            System.out.println("Não há valores a exibir.");
            return;
        }

        int valor = 1;
        while (valor <= n) {
            System.out.println(valor);
            valor++;
        }
    }
}
