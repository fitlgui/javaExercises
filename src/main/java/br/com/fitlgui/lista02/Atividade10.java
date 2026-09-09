package br.com.fitlgui.lista02;

import java.util.Scanner;

// 10. Validar o usuário e, somente depois, verificar a senha.
public class Atividade10 {
    public Atividade10() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o nome de usuário: ");
        String usuario = sc.nextLine();
        System.out.print("Digite a senha: ");
        String senha = sc.nextLine();

        if (!usuario.equals("admin")) {
            System.out.println("Usuário não foi encontrado.");
        } else {
            if (senha.equals("java123")) {
                System.out.println("Acesso liberado.");
            } else {
                System.out.println("Senha incorreta.");
            }
        }
    }
}
