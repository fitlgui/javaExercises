package br.com.fitlgui.lista03;

import java.util.Scanner;

// 7. Calcular a média da turma e contar as notas por situação.
public class Atividade7 {
    public Atividade7() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a quantidade de alunos: ");
        int quantidade = sc.nextInt();

        if (quantidade <= 0) {
            System.out.println("Quantidade inválida.");
            return;
        }

        double soma = 0;
        int aprovados = 0;
        int abaixoDaMedia = 0;

        for (int i = 1; i <= quantidade; i++) {
            System.out.print("Digite a nota do aluno " + i + ": ");
            double nota = sc.nextDouble();
            soma += nota;
            if (nota >= 6) aprovados++;
            else abaixoDaMedia++;
        }

        System.out.printf("Média da turma: %.2f%n", soma / quantidade);
        System.out.println("Alunos com nota maior ou igual a 6: " + aprovados);
        System.out.println("Alunos abaixo de 6: " + abaixoDaMedia);
    }
}
