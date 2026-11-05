package br.com.fitlgui.lista04;

import br.com.fitlgui.util.Entrada;

/** Resolução do exercício 04 da lista 04. */
public class Exercicio04 {
    public static void main(String[] args) {
        double[] precos = new double[5];
        double total = 0;
        for (int i = 0; i < precos.length; i++) {
            precos[i] = Entrada.decimal("Preço " + (i + 1) + ": ");
            total += precos[i];
        }
        for (int i = 0; i < precos.length; i++)
            System.out.printf(java.util.Locale.forLanguageTag("pt-BR"), "Produto %d: R$ %.2f%n", i + 1, precos[i]);
        System.out.printf(java.util.Locale.forLanguageTag("pt-BR"), "Total: R$ %.2f%n", total);
    }


}
