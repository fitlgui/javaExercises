package br.com.fitlgui.lista01;

import java.util.Scanner;

// 12. Ler o consumo mensal de energia em kWh e calcular o valor da conta. Até 100
// kWh o preço é 0,50 por kWh. De 101 a 300 kWh o preço é 0,75 por kWh. Acima de 300
// kWh o preço é 1,10 por kWh. A faixa escolhida é aplicada sobre o consumo total.
public class Atividade12 {
    public Atividade12() {
        Scanner sc = new Scanner(System.in);

        // Variaveis
        double consumoKWH = 0;
        double precoKWH = 0;

        System.out.println("Digite o consumo em KWH: ");
        consumoKWH = sc.nextDouble();

        if(consumoKWH  <= 100) {
            precoKWH = 0.5;
        } else if(consumoKWH > 100 && consumoKWH <= 300) {
            precoKWH = 0.75;
        } else {
            precoKWH = 1.10;
        }

        System.out.println("CONSUMO EM KWH: " + consumoKWH);
        System.out.println("PRECO KWH: " + precoKWH);
        System.out.println("VALOR FINAL KWH: " + consumoKWH * precoKWH);
    }
}
