package br.com.fitlgui.lista01;

import java.util.Scanner;

// 3. Ler um valor em reais e a cotação do dólar e exibir o valor convertido
public class Atividade3 {
    public Atividade3() {
        Scanner sc = new Scanner(System.in);

        // Recebe valor em reais
        System.out.println("DIGITE UM VALOR EM REAIS: ");
        double reais = sc.nextDouble();

        // Recebe valor do dolar
        System.out.println("DIGITE O VALOR DO DOLAR: ");
        double dolar = sc.nextDouble();

        System.out.println("O VALOR CONVERTIDO É: " + (reais/dolar));
    }
}
