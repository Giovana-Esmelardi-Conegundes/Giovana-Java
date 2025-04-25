import java.util.Scanner;

public class clientes{
    public static void main(String[] args) {
        System.out.println("\033[H\033[2J");
        System.out.flush();
        Scanner scanner = new Scanner (System.in);

        String nome;
        int idade;
        String agencia;
        double saque = 0;
        double saldo = 10000;

        System.out.print("Digite seu nome: ");
        nome = scanner.nextLine();

        System.out.print("Qual sua idade: ");
        idade = scanner.nextInt();
        scanner.nextLine(); // Consumir o caractere de nova linha residual
        
        System.out.print("Digite sua agencia: ");
        agencia = scanner.nextLine();
        
        



// Exibe o saldo inicial

        System.out.println("Seu saldo inicial é: " + saldo);

        System.out.println("Qual o valor do saque?");
        saque = scanner.nextDouble();
        
       

        if(saldo < 10000){
            System.out.println("Você não pode sacar mais que 10.000");
        }else if(saque <= saldo){
            System.out.println("Saque realizado com sucesso!!!");
        }else{
            System.out.println("Saldo insuficinete, você é pobre viu");
        }


        saldo -= saque; 
        System.out.println("Saldo final: " + saldo);
        scanner.close();
    }
}
