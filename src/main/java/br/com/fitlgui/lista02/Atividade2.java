package br.com.fitlgui.lista02;

import java.util.Scanner;

// 2. Ler um inteiro e imprimir cada característica verdadeira.
public class Atividade2 {
    public Atividade2() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int numero = sc.nextInt();
        int modulo = Math.abs(numero);
        boolean encontrou = false;

        if (numero > 0) { System.out.println("É positivo."); encontrou = true; }
        if (numero % 2 == 0) { System.out.println("É par."); encontrou = true; }
        if (numero % 5 == 0) { System.out.println("É múltiplo de 5."); encontrou = true; }
        if (modulo >= 10 && modulo <= 99) { System.out.println("Tem dois dígitos."); encontrou = true; }

        if (!encontrou) System.out.println("Nenhuma característica verdadeira.");
    }
}
