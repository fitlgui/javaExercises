package br.com.fitlgui.lista02;

import java.util.Scanner;

// 14. Ler o mês e imprimir a quantidade de dias.
public class Atividade14 {
    public Atividade14() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o número do mês: ");
        int mes = sc.nextInt();

        switch (mes) {
            case 1, 3, 5, 7, 8, 10, 12 -> System.out.println("O mês tem 31 dias.");
            case 4, 6, 9, 11 -> System.out.println("O mês tem 30 dias.");
            case 2 -> System.out.println("O mês tem 28 dias.");
            default -> System.out.println("Mês inválido.");
        }
    }
}
