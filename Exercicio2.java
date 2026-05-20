import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        double somaSalarios = 0;
        int somaFilhos = 0;
        int quantidadePessoas = 0;
        
        while (true) {
            System.out.print("Informe o salário (ou valor negativo para encerrar): ");
            double salario = sc.nextDouble();
            
            if (salario < 0) {
                break;
            }
            
            System.out.print("Informe o número de filhos: ");
            int filhos = sc.nextInt();
            
            somaSalarios += salario;
            somaFilhos += filhos;
            quantidadePessoas++;
            System.out.println("---");
        }
        
        if (quantidadePessoas > 0) {
            System.out.printf("Média de salário: R$ %.2f\n", (somaSalarios / quantidadePessoas));
            System.out.printf("Média de filhos: %.2f\n", ((double) somaFilhos / quantidadePessoas));
        } else {
            System.out.println("Nenhum dado válido foi inserido.");
        }
        sc.close();
    }
}