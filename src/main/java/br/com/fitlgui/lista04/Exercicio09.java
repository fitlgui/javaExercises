package br.com.fitlgui.lista04;

import br.com.fitlgui.util.Entrada;

/** Resolução do exercício 09 da lista 04. */
public class Exercicio09 {
    public static void main(String[] args) {
        int[] codigos = {101, 205, 310, 420, 550};
        double[] precos = {4.50, 12.00, 7.90, 25.00, 3.20};
        int codigo = Entrada.inteiro("Código: ");
        int indice = -1;
        for (int i = 0; i < codigos.length; i++) {
            if (codigos[i] == codigo) { indice = i; break; }
        }
        if (indice == -1) System.out.println("Produto não encontrado.");
        else System.out.printf(java.util.Locale.forLanguageTag("pt-BR"), "Preço: R$ %.2f%n", precos[indice]);
    }


}
