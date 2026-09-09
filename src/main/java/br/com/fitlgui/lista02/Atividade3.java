package br.com.fitlgui.lista02;

import java.util.Scanner;

// 3. Ler temperatura e umidade e imprimir os alertas aplicáveis.
public class Atividade3 {
    public Atividade3() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a temperatura em Celsius: ");
        double temperatura = sc.nextDouble();
        System.out.print("Digite a umidade relativa do ar: ");
        double umidade = sc.nextDouble();

        if (temperatura >= 38) System.out.println("Alerta de calor extremo.");
        if (umidade < 30) System.out.println("Alerta de umidade baixa.");
        if (temperatura >= 35 && umidade < 20) System.out.println("Alerta de risco de queimada.");
    }
}
