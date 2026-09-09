package br.com.fitlgui.lista02;

import java.util.Scanner;

// 11. Avaliar a aprovação por frequência e média final.
public class Atividade11 {
    public Atividade11() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a frequência (%): ");
        double frequencia = sc.nextDouble();
        System.out.print("Digite a média final: ");
        double media = sc.nextDouble();

        if (frequencia < 75) {
            System.out.println("Reprovado por falta.");
        } else if (media >= 7) {
            System.out.println("Aprovado.");
        } else if (media >= 5) {
            System.out.println("Recuperação.");
        } else {
            System.out.println("Reprovado por nota.");
        }
    }
}
