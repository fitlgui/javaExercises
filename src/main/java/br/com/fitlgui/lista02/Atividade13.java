package br.com.fitlgui.lista02;

import java.util.Scanner;

// 13. Executar uma operação matemática usando switch.
public class Atividade13 {
    public Atividade13() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        double primeiro = sc.nextDouble();
        System.out.print("Digite o segundo número: ");
        double segundo = sc.nextDouble();
        System.out.print("Escolha (1-soma, 2-subtração, 3-multiplicação, 4-divisão): ");
        int opcao = sc.nextInt();

        switch (opcao) {
            case 1 -> System.out.printf("Resultado: %.2f%n", primeiro + segundo);
            case 2 -> System.out.printf("Resultado: %.2f%n", primeiro - segundo);
            case 3 -> System.out.printf("Resultado: %.2f%n", primeiro * segundo);
            case 4 -> {
                if (segundo == 0) System.out.println("Não é possível dividir por zero.");
                else System.out.printf("Resultado: %.2f%n", primeiro / segundo);
            }
            default -> System.out.println("Opção inválida.");
        }
    }
}
