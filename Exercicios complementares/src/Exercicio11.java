import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
			int A[] = new int[10];

			System.out.println("Digite 10 números para o vetor A:");
			for (int i = 0; i < 10; i++) A[i] = sc.nextInt();

			System.out.print("Digite um número X para buscar: ");
			int X = sc.nextInt();

			boolean achou = false;

			for (int i = 0; i < 10; i++) {
			    if (A[i] == X) {
			        achou = true;
			        break;
			    }
			}

			if (achou) System.out.println("O número está no vetor.");
			else System.out.println("O número NÃO está no vetor.");
		}
    }
}
