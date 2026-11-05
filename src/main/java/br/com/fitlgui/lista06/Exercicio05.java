package br.com.fitlgui.lista06;

import br.com.fitlgui.util.Entrada;

/** Resolução do exercício 05 da lista 06. */
public class Exercicio05 {
    public static void main(String[] args) {
        int[][] matriz = new int[3][3];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = Integer.parseInt(IO.readln("Valor [" + i + "][" + j + "]: ").trim());
            }
        }
        System.out.print("Diagonal principal: ");
        for (int i = 0; i < matriz.length; i++) System.out.print(matriz[i][i] + " ");
        System.out.println();
    }


}
