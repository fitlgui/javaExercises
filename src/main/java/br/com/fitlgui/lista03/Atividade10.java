package br.com.fitlgui.lista03;

import java.util.Scanner;

// 10. Processar produtos até o código zero e aplicar a forma de pagamento.
public class Atividade10 {
    public Atividade10() {
        Scanner sc = new Scanner(System.in);

        double total = 0;
        int quantidadeItens = 0;
        int codigo;

        do {
            System.out.print("Digite o código do produto (0 encerra): ");
            codigo = sc.nextInt();

            if (codigo != 0) {
                System.out.print("Digite o preço unitário: ");
                double preco = sc.nextDouble();
                System.out.print("Digite a quantidade: ");
                int quantidade = sc.nextInt();
                total += preco * quantidade;
                quantidadeItens += quantidade;
            }
        } while (codigo != 0);

        System.out.print("Forma de pagamento (1-dinheiro, 2-débito, 3-crédito): ");
        int pagamento = sc.nextInt();
        switch (pagamento) {
            case 1 -> total *= 0.95;
            case 2 -> { }
            case 3 -> total *= 1.03;
            default -> System.out.println("Forma de pagamento inválida. Total sem alteração.");
        }

        if (total > 300.00) System.out.println("Aviso: compra grande.");
        if (quantidadeItens > 20) System.out.println("Aviso: muitos itens.");

        System.out.printf("Total final: R$ %.2f%n", total);
    }
}
