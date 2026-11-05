package br.com.fitlgui.lista04;

import br.com.fitlgui.util.Entrada;

/** Resolução do exercício 10 da lista 04. */
public class Exercicio10 {
    public static void main(String[] args) {
        int n = Entrada.inteiro("Quantidade de itens: ");
        if (n < 1) { System.out.println("Quantidade inválida."); return; }
        double[] precos = new double[n];
        int[] quantidades = new int[n];
        for (int i = 0; i < n; i++) {
            precos[i] = Entrada.decimal("Preço unitário do item " + (i + 1) + ": ");
            quantidades[i] = Entrada.inteiro("Quantidade do item " + (i + 1) + ": ");
        }
        double total = 0;
        for (int i = 0; i < n; i++) {
            double subtotal = precos[i] * quantidades[i];
            total += subtotal;
            System.out.printf(java.util.Locale.forLanguageTag("pt-BR"), "Subtotal item %d: R$ %.2f%n", i + 1, subtotal);
        }
        double desconto = total > 200 ? total * 0.05 : 0;
        System.out.printf(java.util.Locale.forLanguageTag("pt-BR"),
            "Total: R$ %.2f%nDesconto: R$ %.2f%nValor final: R$ %.2f%n", total, desconto, total - desconto);
    }


}
