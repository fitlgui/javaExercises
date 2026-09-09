package br.com.fitlgui.lista03;

import java.util.Scanner;

// 5. Somar todos os pares no intervalo usando for.
public class Atividade5 {
    public Atividade5() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite A: ");
        int a = sc.nextInt();
        System.out.print("Digite B: ");
        int b = sc.nextInt();

        if (a > b) {
            System.out.println("Intervalo inválido.");
            return;
        }

        int soma = 0;
        for (int i = a; i <= b; i++) {
            if (i % 2 == 0) soma += i;
        }
        System.out.println("Soma dos pares: " + soma);
    }
}
