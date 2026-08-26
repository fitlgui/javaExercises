package br.com.fitlgui.lista01;

import java.util.Scanner;

// 8. Ler uma temperatura em graus Celsius e convertê-la para Fahrenheit e para Kelvin.
public class Atividade8 {
    public Atividade8() {
        Scanner sc = new Scanner(System.in);

        // Variaveis
        double temp = 0;

        System.out.println("Digite a temperatura em Cª: ");
        temp = sc.nextDouble();

        System.out.println("FAHRENHEIT: " + temp  * 32);
        System.out.println("KELVIN: " + temp + 273.15);
    }
}
