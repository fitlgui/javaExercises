package br.com.fitlgui.lista02;

import java.util.Scanner;

// 6. Ler o valor da compra, o frete e o total a pagar.
public class Atividade6 {
    public Atividade6() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor da compra: ");
        double compra = sc.nextDouble();
        double frete = compra >= 199.00 ? 0.00 : 24.90;

        System.out.printf("Frete: R$ %.2f%n", frete);
        System.out.printf("Total a pagar: R$ %.2f%n", compra + frete);
    }
}
