package br.com.fitlgui.lista02;

import java.util.Scanner;

// 8. Classificar uma infração conforme a velocidade da via e do veículo.
public class Atividade8 {
    public Atividade8() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a velocidade máxima da via: ");
        double limite = sc.nextDouble();
        System.out.print("Digite a velocidade do veículo: ");
        double velocidade = sc.nextDouble();

        if (limite <= 0 || velocidade < 0) {
            System.out.println("Valores inválidos.");
        } else {
            double percentual = (velocidade - limite) / limite * 100;

            if (velocidade <= limite) {
                System.out.println("Dentro do limite. Não há multa.");
            } else if (percentual <= 20) {
                System.out.println("Infração média.");
            } else if (percentual <= 50) {
                System.out.println("Infração grave.");
            } else {
                System.out.println("Infração gravíssima.");
            }
        }
    }
}
