package br.com.fitlgui.lista01;

import java.util.Scanner;

// 5. Ler o valor da hora trabalhada e a quantidade de horas do mês. Calcular o salário
// bruto, o desconto de 8 por cento de INSS e o salário líquido
public class Atividade5 {
    public Atividade5() {
        Scanner sc = new Scanner(System.in);

        // Variaveis
        double valorHora = 0;
        double horasMes = 0;

        // Ler valores
        System.out.println("Digite valor da hora trabalhada: ");
        valorHora = sc.nextDouble();
        clean(sc);

        System.out.println("Digite quantidade de horas no mês: ");
        horasMes = sc.nextDouble();
        clean(sc);

        System.out.println("DADOS SALARIAIS: ");
        System.out.println("SALARIO BRUTO: " + (valorHora * horasMes));
        System.out.println("DESCONTO INSS: " + (valorHora * horasMes) * 0.08);
        System.out.println("SALARIO LIQUIDO: " + (valorHora * horasMes) * 0.92);
    }

    private static void clean(Scanner sc) {
        sc.nextLine();
    }
}
