package br.com.fitlgui.lista01;

import java.util.Arrays;
import java.util.Scanner;

// 11. Ler três números inteiros distintos e exibir o maior deles.
public class Atividade11 {
    public Atividade11() {
        Scanner sc = new Scanner(System.in);

        // Variaveis
        int[] nums = new int[2];

        // Loop
        for (int i = 0; i < 3; i++) {
            System.out.println("DIGITE O " + i + "ª NÚMERO: ");
            nums[i] = sc.nextInt();
        }

        System.out.println("O MAIOR NÚMERO DESSE ARRAY É: " + Arrays.stream(nums).max().getAsInt());
    }
}
