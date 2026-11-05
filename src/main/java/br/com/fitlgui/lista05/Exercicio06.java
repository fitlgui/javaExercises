package br.com.fitlgui.lista05;

import br.com.fitlgui.util.Entrada;

/** Resolução do exercício 06 da lista 05. */
public class Exercicio06 {
    public static void main(String[] args) {
        String[] frases = new String[3];
        for (int i = 0; i < frases.length; i++) frases[i] = Entrada.texto("Frase " + (i + 1) + ": ");
        exibirContagem(frases);
    }

    public static int contarVogais(String texto) {
        String minusculo = texto.toLowerCase(java.util.Locale.ROOT);
        String vogais = "aeiouáàâãäéèêëíìîïóòôõöúùûü";
        int quantidade = 0;
        for (int i = 0; i < minusculo.length(); i++)
            if (vogais.indexOf(minusculo.charAt(i)) >= 0) quantidade++;
        return quantidade;
    }

    public static void exibirContagem(String[] frases) {
        if (frases.length == 0) return;
        int indiceMaior = 0;
        for (int i = 0; i < frases.length; i++) {
            int quantidade = contarVogais(frases[i]);
            System.out.println(frases[i] + " - Vogais: " + quantidade);
            if (quantidade > contarVogais(frases[indiceMaior])) indiceMaior = i;
        }
        System.out.println("Frase com mais vogais: " + frases[indiceMaior]);
    }
}
