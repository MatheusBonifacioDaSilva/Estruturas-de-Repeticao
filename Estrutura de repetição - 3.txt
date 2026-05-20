import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        for (int i = 1; i <= 5; i++) {
            System.out.print("Informe o valor " + i + ": ");
            double valor = sc.nextDouble();
            System.out.println("O dobro de " + valor + " é " + (valor * 2));
        }
        sc.close();
    }
}