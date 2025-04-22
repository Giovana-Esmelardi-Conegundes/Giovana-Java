//Programa simples em Java que imprime a tabuada de um número informado pelo usuário, utilizando estrutura de repetição for.

package estruturarepeticao;
import java.util.Scanner;
public class EstruturaRepeticao {
    
    public static void main(String[] args) {
        int i, num, tab;
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        num = sc.nextInt();
        for(i=1; i<10; i++) { //ir de um em um ++
             tab = num * i;
             System.out.println(num + " * " + i + " = " +tab);
                  
    }
  }
}
