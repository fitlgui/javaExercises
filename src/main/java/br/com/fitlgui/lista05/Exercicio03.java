package br.com.fitlgui.lista05;

import br.com.fitlgui.util.Entrada;

/** Resolução do exercício 03 da lista 05. */
public class Exercicio03 {
    public static void main(String[] args) {
        int[] numeros = new int[8];
        for (int i = 0; i < numeros.length; i++) numeros[i] = Entrada.inteiro("Número: ");
        exibirPrimos(numeros);
        System.out.println("Quantidade de primos: " + contarPrimos(numeros));
    }

    public static boolean ehPrimo(int numero) {
        if (numero < 2) return false;
        // A divisão evita overflow que poderia ocorrer em divisor * divisor.
        for (int divisor = 2; divisor <= numero / divisor; divisor++)
            if (numero % divisor == 0) return false;
        return true;
    }

    public static int contarPrimos(int[] v) {
        int quantidade = 0;
        for (int numero : v) if (ehPrimo(numero)) quantidade++;
        return quantidade;
    }

    public static void exibirPrimos(int[] v) {
        for (int numero : v) if (ehPrimo(numero)) System.out.print(numero + " ");
        System.out.println();
    }
}
