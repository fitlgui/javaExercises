package br.com.fitlgui.lista06;

import br.com.fitlgui.util.Entrada;

/** Compatibilidade com IO.readln do enunciado em JDK 17 ou superior. */
public class IO {
    public static String readln(String mensagem) { return Entrada.texto(mensagem); }
}
