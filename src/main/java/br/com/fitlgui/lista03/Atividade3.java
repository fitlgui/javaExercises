package br.com.fitlgui.lista03;

import java.util.Scanner;

// 3. Ler uma nota até que ela esteja entre 0 e 10 usando do-while.
public class Atividade3 {
    public Atividade3() {
        Scanner sc = new Scanner(System.in);

        double nota;
        do {
            System.out.print("Digite uma nota entre 0 e 10: ");
            nota = sc.nextDouble();
            if (nota < 0 || nota > 10) System.out.println("Valor inválido.");
        } while (nota < 0 || nota > 10);

        System.out.printf("Nota aceita: %.2f%n", nota);
    }
}
