import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int homensNoPeso = 0;
        int mulheresNoPeso = 0;
        
        for (int i = 1; i <= 10; i++) {
            System.out.println("Pessoa " + i);
            System.out.print("Sexo (M/F): ");
            char sexo = sc.next().toUpperCase().charAt(0);
            
            System.out.print("Peso (kg): ");
            double peso = sc.nextDouble();
            
            if (sexo == 'M' && peso >= 60 && peso <= 80) {
                homensNoPeso++;
            } else if (sexo == 'F' && peso >= 50 && peso <= 70) {
                mulheresNoPeso++;
            }
            System.out.println("---");
        }
        
        System.out.println("Quantidade de homens com peso entre 60 e 80 kg: " + homensNoPeso);
        System.out.println("Quantidade de mulheres com peso entre 50 e 70 kg: " + mulheresNoPeso);
        
        sc.close();
    }
}