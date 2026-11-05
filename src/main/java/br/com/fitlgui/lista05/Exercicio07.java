package br.com.fitlgui.lista05;

import br.com.fitlgui.util.Entrada;

/** Resolução do exercício 07 da lista 05. */
public class Exercicio07 {
    public static void main(String[] args) {
        String[] nomes = new String[4];
        for (int i = 0; i < nomes.length; i++) nomes[i] = Entrada.texto("Nome completo: ");
        exibirChamada(nomes);
    }

    public static String gerarIniciais(String nomeCompleto) {
        String nome = nomeCompleto.trim();
        if (nome.isEmpty()) return "";
        String[] partes = nome.split("\\s+");
        String iniciais = "";
        for (String parte : partes) iniciais += parte.substring(0, 1).toUpperCase(java.util.Locale.ROOT) + ".";
        return iniciais;
    }

    public static void exibirChamada(String[] nomes) {
        for (int i = 0; i < nomes.length; i++)
            System.out.println((i + 1) + ". " + nomes[i] + " (" + gerarIniciais(nomes[i]) + ")");
    }
}
