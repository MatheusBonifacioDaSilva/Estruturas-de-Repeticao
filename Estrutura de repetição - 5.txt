import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double somaTemperaturas = 0;
        
        for (int i = 1; i <= 10; i++) {
            System.out.print("Informe a temperatura do dia " + i + " de janeiro: ");
            somaTemperaturas += sc.nextDouble();
        }
        
        double media = somaTemperaturas / 10.0;
        System.out.printf("A média das temperaturas coletadas é: %.2f°C\n", media);
        
        sc.close();
    }
}