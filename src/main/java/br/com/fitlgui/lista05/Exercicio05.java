package br.com.fitlgui.lista05;

import br.com.fitlgui.util.Entrada;

/** Resolução do exercício 05 da lista 05. */
public class Exercicio05 {
    public static void main(String[] args) {
        int[] numeros = new int[5];
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = Entrada.inteiro("Número não negativo: ");
            if (numeros[i] < 0) { System.out.println("Número inválido."); return; }
        }
        exibirTabela(numeros);
    }

    public static String paraBinario(int n) {
        if (n < 0) throw new IllegalArgumentException("Número negativo.");
        if (n == 0) return "0";
        String binario = "";
        while (n > 0) { binario = (n % 2) + binario; n /= 2; }
        return binario;
    }

    public static void exibirTabela(int[] v) {
        for (int numero : v) System.out.println(numero + " = " + paraBinario(numero));
    }
}
