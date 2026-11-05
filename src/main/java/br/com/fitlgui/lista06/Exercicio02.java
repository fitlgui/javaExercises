package br.com.fitlgui.lista06;

import br.com.fitlgui.util.Entrada;

/** Resolução do exercício 02 da lista 06. */
public class Exercicio02 {
    public static void main(String[] args) {
        int[][] matriz = new int[3][3];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = Integer.parseInt(IO.readln("Valor [" + i + "][" + j + "]: ").trim());
            }
        }
        int soma = 0;
        for (int i = 0; i < matriz.length; i++)
            for (int j = 0; j < matriz[i].length; j++) soma += matriz[i][j];
        System.out.println("Soma: " + soma);
    }


}
