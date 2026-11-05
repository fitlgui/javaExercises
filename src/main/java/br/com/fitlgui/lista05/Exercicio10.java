package br.com.fitlgui.lista05;

import br.com.fitlgui.util.Entrada;

/** Resolução do exercício 10 da lista 05. */
public class Exercicio10 {
    public static void main(String[] args) {
        int n = Entrada.inteiro("Quantidade (1 a 30): ");
        if (n < 1 || n > 30) { System.out.println("Quantidade inválida."); return; }
        int[] valores = new int[n];
        for (int i = 0; i < valores.length; i++) valores[i] = fibonacci(i);
        exibir(valores);
        System.out.println("Soma: " + somar(valores));
    }

    public static int fibonacci(int n) {
        if (n < 0) throw new IllegalArgumentException("Índice negativo.");
        if (n == 0) return 0;
        if (n == 1) return 1;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static int somar(int[] v) {
        int soma = 0;
        for (int numero : v) soma += numero;
        return soma;
    }

    public static void exibir(int[] v) {
        for (int numero : v) System.out.print(numero + " ");
        System.out.println();
    }
}
