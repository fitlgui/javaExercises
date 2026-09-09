package br.com.fitlgui.lista02;

import java.util.Scanner;

// 1. Ler a idade e imprimir todas as classificações que se aplicam.
public class Atividade1 {
    public Atividade1() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a idade: ");
        int idade = sc.nextInt();

        if (idade >= 16) System.out.println("Pode votar.");
        if (idade >= 18) System.out.println("Pode dirigir.");
        if (idade >= 60) System.out.println("É idoso.");
    }
}
