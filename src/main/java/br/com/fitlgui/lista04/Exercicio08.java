package br.com.fitlgui.lista04;

import br.com.fitlgui.util.Entrada;

/** Resolução do exercício 08 da lista 04. */
public class Exercicio08 {
    public static void main(String[] args) {
        double[] notas = new double[10];
        int aprovados = 0, recuperacao = 0, reprovados = 0;
        for (int i = 0; i < notas.length; i++) {
            notas[i] = Entrada.decimal("Nota " + (i + 1) + ": ");
            if (notas[i] >= 6) aprovados++;
            else if (notas[i] >= 4) recuperacao++;
            else reprovados++;
        }
        System.out.println("Aprovados: " + aprovados);
        System.out.println("Recuperação: " + recuperacao);
        System.out.println("Reprovados: " + reprovados);
    }


}
