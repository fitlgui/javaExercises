package br.com.fitlgui.lista02;

import java.util.Scanner;

// 12. Validar saldo, limite diário e realizar o saque quando possível.
public class Atividade12 {
    public Atividade12() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o saldo da conta: ");
        double saldo = sc.nextDouble();
        System.out.print("Digite o limite diário de saque: ");
        double limite = sc.nextDouble();
        System.out.print("Digite o valor solicitado: ");
        double valor = sc.nextDouble();

        if (saldo < valor) {
            System.out.println("Saldo insuficiente.");
        } else {
            if (valor > limite) {
                System.out.println("O valor ultrapassa o limite diário.");
            } else {
                double novoSaldo = saldo - valor;
                System.out.printf("Saque efetuado. Novo saldo: R$ %.2f%n", novoSaldo);
            }
        }
    }
}
