package br.com.fitlgui.lista04;

import br.com.fitlgui.util.Entrada;

/** Resolução do exercício 07 da lista 04. */
public class Exercicio07 {
    public static void main(String[] args) {
        double[] salarios = new double[6];
        double soma = 0;
        for (int i = 0; i < salarios.length; i++) {
            salarios[i] = Entrada.decimal("Salário " + (i + 1) + ": ");
            soma += salarios[i];
        }
        double maior = salarios[0], menor = salarios[0];
        double media = soma / salarios.length;
        int acima = 0;
        for (double salario : salarios) {
            if (salario > maior) maior = salario;
            if (salario < menor) menor = salario;
            if (salario > media) acima++;
        }
        System.out.printf(java.util.Locale.forLanguageTag("pt-BR"),
            "Maior: R$ %.2f%nMenor: R$ %.2f%nMédia: R$ %.2f%n", maior, menor, media);
        System.out.println("Acima da média: " + acima);
    }


}
