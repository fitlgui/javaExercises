package br.com.fitlgui.lista01;

import java.util.Scanner;

// 7. Ler a base e a altura de um retângulo e exibir a área, o perímetro e a diagonal
public class Atividade7 {
    public Atividade7() {
        Scanner sc = new Scanner(System.in);

        // Variaveis
        double base = 0;
        double altura = 0;

        // Ler dados
        System.out.println("Digite a base do retangulo: ");
        base = sc.nextDouble();
        sc.nextLine();
        System.out.println("Digite a altura do retangulo: ");
        altura = sc.nextDouble();

        // Calculos
        System.out.println("PERIMETRO: " + (base + altura) * 2);
        System.out.println("DIAGONAL: " + Math.sqrt((base * base) + (altura * altura)));
    }
}
