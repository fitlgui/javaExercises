package br.com.fitlgui.util;

import java.util.Scanner;

/** Entrada por linha: aceita vírgula ou ponto como separador decimal. */
public class Entrada {
    private static final Scanner TECLADO = new Scanner(System.in);

    public static String texto(String mensagem) {
        System.out.print(mensagem);
        return TECLADO.nextLine();
    }

    public static int inteiro(String mensagem) {
        while (true) {
            try { return Integer.parseInt(texto(mensagem).trim()); }
            catch (NumberFormatException e) { System.out.println("Digite um número inteiro válido."); }
        }
    }

    public static double decimal(String mensagem) {
        while (true) {
            try {
                double valor = Double.parseDouble(texto(mensagem).trim().replace(',', '.'));
                if (Double.isFinite(valor)) return valor;
            } catch (NumberFormatException e) { /* Solicita novamente abaixo. */ }
            System.out.println("Digite um número decimal válido.");
        }
    }
}
