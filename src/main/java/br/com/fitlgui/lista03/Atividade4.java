package br.com.fitlgui.lista03;

import java.util.Scanner;

// 4. Exibir um menu repetido com do-while e executar a operação escolhida.
public class Atividade4 {
    public Atividade4() {
        Scanner sc = new Scanner(System.in);

        int opcao;
        do {
            System.out.println("1 - Dobro");
            System.out.println("2 - Metade");
            System.out.println("3 - Quadrado");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt();

            switch (opcao) {
                case 1, 2, 3 -> {
                    System.out.print("Digite um número: ");
                    double numero = sc.nextDouble();
                    if (opcao == 1) System.out.printf("Resultado: %.2f%n", numero * 2);
                    else if (opcao == 2) System.out.printf("Resultado: %.2f%n", numero / 2);
                    else System.out.printf("Resultado: %.2f%n", numero * numero);
                }
                case 0 -> System.out.println("Saindo.");
                default -> System.out.println("Opção inválida.");
            }
        } while (opcao != 0);
    }
}
