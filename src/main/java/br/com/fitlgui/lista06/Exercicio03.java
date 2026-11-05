package br.com.fitlgui.lista06;

import br.com.fitlgui.util.Entrada;

/** Resolução do exercício 03 da lista 06. */
public class Exercicio03 {
    public static void main(String[] args) {
        int[][] matriz = new int[3][3];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = Integer.parseInt(IO.readln("Valor [" + i + "][" + j + "]: ").trim());
            }
        }
        int maior = matriz[0][0];
        for (int i = 0; i < matriz.length; i++)
            for (int j = 0; j < matriz[i].length; j++)
                if (matriz[i][j] > maior) maior = matriz[i][j];
        System.out.println("Maior valor: " + maior);
    }


}
