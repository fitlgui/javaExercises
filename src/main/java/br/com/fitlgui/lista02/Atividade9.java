package br.com.fitlgui.lista02;

import java.util.Scanner;

// 9. Ler o salário e o tempo de casa e calcular o bônus.
public class Atividade9 {
    public Atividade9() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o salário: ");
        double salario = sc.nextDouble();
        System.out.print("Digite o tempo de casa em anos: ");
        int tempo = sc.nextInt();
        double percentual;

        if (tempo < 1) percentual = 0.00;
        else if (tempo <= 3) percentual = 0.05;
        else if (tempo <= 10) percentual = 0.10;
        else percentual = 0.15;

        double bonus = salario * percentual;
        System.out.printf("Percentual do bônus: %.0f%%%n", percentual * 100);
        System.out.printf("Valor do bônus: R$ %.2f%n", bonus);
    }
}
