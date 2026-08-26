package br.com.fitlgui.lista01;

import java.util.Scanner;

// 4. Ler quatro notas bimestrais e exibir a média aritmética do aluno
public class Atividade4 {
    public Atividade4() {
        Scanner sc = new Scanner(System.in);

        // Lista para notas de maneira organizada e media
        double[] notas = new double[3];
        double mediaGeral = 0;

        // Ler notas
        for(int i = 0; i < 4; i++) {
            System.out.println("Digite a nota bimestral do " + i + "º Bimestre: ");
            notas[i] = sc.nextDouble();
            sc.nextLine();
        }

        // Somando notas
        for (double nota: notas) {
            mediaGeral += nota;
        }

        // Calculo de médias
        mediaGeral = mediaGeral / notas.length;

        // Exibição final
        System.out.println("NOTA ARITMÉTICA FINAL: " + mediaGeral);
    }
}
