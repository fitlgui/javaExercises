package br.com.fitlgui.lista03;

import java.util.Scanner;

// 9. Imprimir tabuadas de 1 até N usando laços aninhados.
public class Atividade9 {
    public Atividade9() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite N (1 a 9): ");
        int n = sc.nextInt();

        if (n < 1 || n > 9) {
            System.out.println("Entrada inválida.");
            return;
        }

        for (int tabuada = 1; tabuada <= n; tabuada++) {
            System.out.println("Tabuada do " + tabuada);
            for (int multiplicador = 1; multiplicador <= 10; multiplicador++) {
                System.out.printf("%d x %d = %d%n", tabuada, multiplicador, tabuada * multiplicador);
            }
            System.out.println();
        }
    }
}
