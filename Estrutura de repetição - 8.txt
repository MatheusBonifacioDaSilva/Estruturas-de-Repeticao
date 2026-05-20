import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int maisDe90Kg = 0;
        int somaIdades = 0;
        
        for (int i = 1; i <= 7; i++) {
            System.out.println("Pessoa " + i);
            System.out.print("Idade: ");
            int idade = sc.nextInt();
            
            System.out.print("Peso (kg): ");
            double peso = sc.nextDouble();
            
            somaIdades += idade;
            if (peso > 90) {
                maisDe90Kg++;
            }
            System.out.println("---");
        }
        
        System.out.println("Quantidade de pessoas com mais de 90 kg: " + maisDe90Kg);
        System.out.printf("Média das idades: %.2f anos\n", ((double)somaIdades / 7.0));
        
        sc.close();
    }
}