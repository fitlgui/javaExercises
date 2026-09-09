package br.com.fitlgui.lista02;

import java.util.Scanner;

// 7. Ler a hora e imprimir a saudação correspondente.
public class Atividade7 {
    public Atividade7() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a hora do dia (0 a 23): ");
        int hora = sc.nextInt();

        if (hora >= 0 && hora <= 11) {
            System.out.println("Bom dia.");
        } else if (hora <= 17) {
            System.out.println("Boa tarde.");
        } else if (hora <= 23) {
            System.out.println("Boa noite.");
        } else {
            System.out.println("Hora inválida.");
        }
    }
}
