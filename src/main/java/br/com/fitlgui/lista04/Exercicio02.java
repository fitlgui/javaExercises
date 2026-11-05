package br.com.fitlgui.lista04;

import br.com.fitlgui.util.Entrada;

/** Resolução do exercício 02 da lista 04. */
public class Exercicio02 {
    public static void main(String[] args) {
        double[] precos = new double[3];
        precos[0] = 12.90;
        precos[1] = 5.50;
        precos[2] = 30.00;
        for (int i = 0; i < precos.length; i++)
            System.out.printf(java.util.Locale.forLanguageTag("pt-BR"), "Produto %d: R$ %.2f%n", i + 1, precos[i]);
    }


}
