package br.com.fitlgui.lista03;

import java.util.Scanner;

// 8. Ler inteiros até zero e mostrar quantidade, soma, maior e menor.
public class Atividade8 {
    public Atividade8() {
        Scanner sc = new Scanner(System.in);

        int quantidade = 0;
        int soma = 0;
        int maior = 0;
        int menor = 0;

        System.out.print("Digite um valor inteiro (0 encerra): ");
        int valor = sc.nextInt();

        while (valor != 0) {
            if (quantidade == 0) {
                maior = valor;
                menor = valor;
            } else {
                if (valor > maior) maior = valor;
                if (valor < menor) menor = valor;
            }

            quantidade++;
            soma += valor;

            System.out.print("Digite outro valor inteiro (0 encerra): ");
            valor = sc.nextInt();
        }

        if (quantidade == 0) {
            System.out.println("Nenhum valor foi lido.");
        } else {
            System.out.println("Quantidade: " + quantidade);
            System.out.println("Soma: " + soma);
            System.out.println("Maior: " + maior);
            System.out.println("Menor: " + menor);
        }
    }
}
