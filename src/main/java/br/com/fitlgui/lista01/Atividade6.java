package br.com.fitlgui.lista01;

import java.util.Scanner;

// 6. Ler o raio de um círculo e exibir a área e o perímetro.
public class Atividade6 {
    public Atividade6() {
        Scanner sc = new Scanner(System.in);

        // Variaveis
        double raio = 0;
        double pi = 3.14;

        // Ler raio
        System.out.println("DIGITE O RAIO DO CIRCULO: ");
        raio = sc.nextDouble();

        // Exibição
        System.out.println("PERIMETRO DO CIRCULO: " + (raio * pi));
    }
}
