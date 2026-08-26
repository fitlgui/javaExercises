package br.com.fitlgui.lista01;

import java.util.Scanner;

// 10. Ler a média final de um aluno e classificá-la: média maior ou igual a 7 resulta em
// aprovado, média entre 5 e 7 resulta em recuperação, e média abaixo de 5 resulta em
// reprovado.
public class Atividade10 {
    public Atividade10() {
        Scanner sc = new Scanner(System.in);

        // Variaveis
        double mediaFinal = 0;

        System.out.println("Digite a média final do aluno: ");
        mediaFinal = sc.nextDouble();

        if(mediaFinal >= 7) {
            System.out.println("ALUNO APROVADO");
        } else if (mediaFinal < 7 && mediaFinal >= 5) {
            System.out.println("ALUNO EM RECUPERACAO");
        } else {
            System.out.println("ALUNO REPROVADO");
        }
    }
}
