package br.com.fitlgui.lista05;

import br.com.fitlgui.util.Entrada;

/** Resolução do exercício 09 da lista 05. */
public class Exercicio09 {
    public static void main(String[] args) {
        int expoente = Entrada.inteiro("Expoente não negativo: ");
        if (expoente < 0) { System.out.println("Expoente inválido."); return; }
        int[] bases = new int[5];
        for (int i = 0; i < bases.length; i++) bases[i] = Entrada.inteiro("Base: ");
        exibirPotencias(bases, expoente);
    }

    public static long potencia(int base, int expoente) {
        if (expoente < 0) throw new IllegalArgumentException("Expoente negativo.");
        if (expoente == 0) return 1;
        return base * potencia(base, expoente - 1);
    }

    public static void exibirPotencias(int[] bases, int expoente) {
        for (int base : bases) System.out.println(base + "^" + expoente + " = " + potencia(base, expoente));
    }
}
