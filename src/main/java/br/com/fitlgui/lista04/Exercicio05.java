package br.com.fitlgui.lista04;

import br.com.fitlgui.util.Entrada;

/** Resolução do exercício 05 da lista 04. */
public class Exercicio05 {
    public static void main(String[] args) {
        double[] precos = new double[5];
        double[] comDesconto = new double[5];
        for (int i = 0; i < precos.length; i++) {
            precos[i] = Entrada.decimal("Preço " + (i + 1) + ": ");
            comDesconto[i] = precos[i] * 0.90;
        }
        for (int i = 0; i < precos.length; i++)
            System.out.printf(java.util.Locale.forLanguageTag("pt-BR"),
                "Produto %d: original R$ %.2f; com desconto R$ %.2f%n", i + 1, precos[i], comDesconto[i]);
    }


}
