

package aula_07_04;
  import java.util.Scanner;

public class Aula_07_04.java {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int menuOpcao, qntCompra;
        double pedido;
        String resp, pedidoOutro;

        do {
            System.out.println("===== Menu Café da Manhã =====");
            System.out.println("[1] Expresso: R$4,00");
            System.out.println("[2] Pão na chapa: R$2,50");
            System.out.println("[3] Achocolatado: R$5,00");
            System.out.println("[4] Misto quente: R$3,50");
            System.out.println("[5] Pão de queijo: R$2,00");
            System.out.print("\nDigite o número do item que você deseja: ");

            pedido = 0.0;
            resp = "Sim";
            menuOpcao = sc.nextInt();

            do {
                switch (menuOpcao) {
                    case 1:
                        System.out.print("Quantos expressos você gostaria de pedir? ");
                        qntCompra = sc.nextInt();
                        pedido += 4.0 * qntCompra;
                        break;
                    case 2:
                        System.out.print("Quantos pães na chapa você gostaria de pedir? ");
                        qntCompra = sc.nextInt();
                        pedido += 2.5 * qntCompra;
                        break;
                    case 3:
                        System.out.print("Quantos achocolatados você gostaria de pedir? ");
                        qntCompra = sc.nextInt();
                        pedido += 5.0 * qntCompra;
                        break;
                    case 4:
                        System.out.print("Quantos mistos quentes você gostaria de pedir? ");
                        qntCompra = sc.nextInt();
                        pedido += 3.5 * qntCompra;
                        break;
                    case 5:
                        System.out.print("Quantos pães de queijo você gostaria de pedir? ");
                        qntCompra = sc.nextInt();
                        pedido += 2.0 * qntCompra;
                        break;
                    default:
                        System.out.println("Opção inválida. Tente novamente.");
                        break;
                }

                System.out.print("Gostaria de pedir algo a mais? [Sim/Nao] ");
                resp = sc.next();
                if (resp.equalsIgnoreCase("Sim")) {
                    System.out.print("Digite o número do item que você deseja: ");
                    menuOpcao = sc.nextInt();
                }

            } while (resp.equalsIgnoreCase("Sim"));

            System.out.printf("O total do seu pedido é: R$%.2f%n", pedido);
            System.out.print("Você gostaria de fazer outro pedido? [Sim/Nao] ");
            pedidoOutro = sc.next();

        } while (pedidoOutro.equalsIgnoreCase("Sim"));

        System.out.println("Muito obrigado, volte sempre!");
        sc.close();
    }
}
