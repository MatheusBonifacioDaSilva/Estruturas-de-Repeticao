import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        while (true) {
            System.out.print("Informe a matrícula (ou um número negativo para sair): ");
            int matricula = sc.nextInt();
            
            if (matricula < 0) {
                break;
            }
            
            System.out.print("Informe a nota 1: ");
            double n1 = sc.nextDouble();
            System.out.print("Informe a nota 2: ");
            double n2 = sc.nextDouble();
            System.out.print("Informe a nota 3: ");
            double n3 = sc.nextDouble();
            
            double media = (n1 + n2 + n3) / 3.0;
            
            if (media >= 70) {
                System.out.println("Situação: Aprovado");
            } else if (media >= 60) {
                System.out.println("Situação: Exame");
            } else {
                System.out.println("Situação: Reprovado");
            }
            System.out.println("---");
        }
        sc.close();
    }
}
