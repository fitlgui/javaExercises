package br.com.fitlgui.lista03;

import java.util.Scanner;

// 2. Imprimir a tabuada de um número usando while.
public class Atividade2 {
    public Atividade2() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numero = sc.nextInt();
        int multiplicador = 1;

        while (multiplicador <= 10) {
            System.out.printf("%d x %d = %d%n", numero, multiplicador, numero * multiplicador);
            multiplicador++;
        }
    }
}
