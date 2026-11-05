package br.com.fitlgui.lista05;

import br.com.fitlgui.util.Entrada;

/** Resolução do exercício 08 da lista 05. */
public class Exercicio08 {
    public static void main(String[] args) {
        String frase = Entrada.texto("Frase: ").trim();
        String[] palavras = frase.isEmpty() ? new String[0] : frase.split("\\s+");
        exibirPalavras(palavras);
        System.out.println("Total de palavras: " + palavras.length);
        System.out.println("Maior palavra: " + maiorPalavra(palavras));
    }

    public static String maiorPalavra(String[] palavras) {
        String maior = "";
        for (String palavra : palavras) if (palavra.length() > maior.length()) maior = palavra;
        return maior;
    }

    public static void exibirPalavras(String[] palavras) {
        for (int i = 0; i < palavras.length; i++) System.out.println((i + 1) + ". " + palavras[i]);
    }
}
