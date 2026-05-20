import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Informe um número inteiro: ");
        int limite = sc.nextInt();
        
        System.out.println("Números ímpares de 1 até " + limite + ":");
        for (int i = 1; i <= limite; i += 2) {
            System.out.println(i);
        }
        sc.close();
    }
}