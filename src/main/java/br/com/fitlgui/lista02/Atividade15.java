package br.com.fitlgui.lista02;

import java.util.Scanner;

// 15. Calcular a tarifa de estacionamento, cupom e classificação da permanência.
public class Atividade15 {
    public Atividade15() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Tipo de veículo (1-carro, 2-moto): ");
        int tipo = sc.nextInt();
        double tarifa;

        switch (tipo) {
            case 1 -> tarifa = 8.00;
            case 2 -> tarifa = 5.00;
            default -> {
                System.out.println("Opção inválida.");
                return;
            }
        }

        System.out.print("Quantidade de horas: ");
        int horas = sc.nextInt();
        double valor = tarifa * horas;

        System.out.print("Possui cupom? (sim/nao): ");
        String cupom = sc.next();
        if (cupom.equalsIgnoreCase("sim")) {
            if (valor >= 50.00) {
                valor *= 0.80;
                System.out.println("Desconto de 20% aplicado.");
            } else {
                System.out.println("O cupom vale apenas para valores acima de R$ 50,00.");
            }
        }

        if (horas > 12) System.out.println("Aviso: permanência longa.");
        if (horas > 24) System.out.println("Aviso: cobrança de diária.");

        if (horas <= 2) System.out.println("Permanência curta.");
        else if (horas <= 6) System.out.println("Permanência média.");
        else System.out.println("Permanência longa.");

        System.out.printf("Valor final: R$ %.2f%n", valor);
    }
}
