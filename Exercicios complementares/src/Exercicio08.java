import java.util.Scanner;

public class Exercicio08 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
			int A[] = new int[10];
			int B[] = new int[10];

			System.out.println("Digite 10 valores:");
			for (int i = 0; i < 10; i++) A[i] = sc.nextInt();

			for (int i = 0; i < 10; i++) {
			    int soma = 0;
			    for (int j = 0; j <= i; j++) soma += A[j];
			    B[i] = soma;
			}

			System.out.println("Vetor B (somatório cumulativo):");
			for (int i = 0; i < 10; i++) System.out.print(B[i] + " ");
		}
    }
}


