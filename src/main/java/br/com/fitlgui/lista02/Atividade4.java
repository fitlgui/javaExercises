package br.com.fitlgui.lista02;

import java.util.Scanner;

// 4. Ler dois inteiros e informar se o primeiro é múltiplo do segundo.
public class Atividade4 {
    public Atividade4() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int primeiro = sc.nextInt();
        System.out.print("Digite o segundo número: ");
        int segundo = sc.nextInt();

        if (segundo == 0) {
            System.out.println("A verificação não pode ser feita.");
        } else if (primeiro % segundo == 0) {
            System.out.println("O primeiro número é múltiplo do segundo.");
        } else {
            System.out.println("O primeiro número não é múltiplo do segundo.");
        }
    }
}
