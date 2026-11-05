package br.com.fitlgui.lista05;

import br.com.fitlgui.util.Entrada;

/** Resolução do exercício 01 da lista 05. */
public class Exercicio01 {
    public static void main(String[] args) {
        int[] alturas = new int[3];
        for (int i = 0; i < alturas.length; i++) {
            alturas[i] = Entrada.inteiro("Altura " + (i + 1) + ": ");
            if (alturas[i] < 0) { System.out.println("Altura inválida."); return; }
        }
        for (int altura : alturas) { desenharTriangulo(altura); System.out.println(); }
    }

    public static String gerarLinha(char simbolo, int tamanho) {
        String linha = "";
        for (int i = 0; i < tamanho; i++) linha += simbolo;
        return linha;
    }

    public static void desenharTriangulo(int altura) {
        for (int i = 1; i <= altura; i++) System.out.println(gerarLinha('*', i));
    }
}
