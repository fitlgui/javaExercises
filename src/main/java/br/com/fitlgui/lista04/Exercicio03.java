package br.com.fitlgui.lista04;

import br.com.fitlgui.util.Entrada;

/** Resolução do exercício 03 da lista 04. */
public class Exercicio03 {
    public static void main(String[] args) {
        double[] notas = new double[4];
        double soma = 0;
        for (int i = 0; i < notas.length; i++) {
            notas[i] = Entrada.decimal("Nota " + (i + 1) + ": ");
            soma += notas[i];
        }
        double media = soma / notas.length;
        System.out.printf(java.util.Locale.forLanguageTag("pt-BR"), "Média: %.2f%n", media);
        System.out.println(media >= 6 ? "Aprovado" : "Reprovado");
    }


}
