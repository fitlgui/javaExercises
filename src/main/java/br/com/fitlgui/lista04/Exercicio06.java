package br.com.fitlgui.lista04;

import br.com.fitlgui.util.Entrada;

/** Resolução do exercício 06 da lista 04. */
public class Exercicio06 {
    public static void main(String[] args) {
        double valor = Entrada.decimal("Valor do empréstimo: ");
        double taxa = Entrada.decimal("Juros simples mensais (%): ");
        double[] dividas = new double[12];
        for (int i = 0; i < dividas.length; i++) {
            int mes = i + 1;
            dividas[i] = valor + valor * taxa / 100 * mes;
            System.out.printf(java.util.Locale.forLanguageTag("pt-BR"), "Mês %d: R$ %.2f%n", mes, dividas[i]);
        }
    }


}
