import java.util.Scanner;

public class Exercicio09 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
			int A[] = new int[10];
			int B[] = new int[10];
			int C[] = new int[10];
			int k = 0;

			System.out.println("Digite os 10 valores do vetor A:");
			for (int i = 0; i < 10; i++) A[i] = sc.nextInt();

			System.out.println("Digite os 10 valores do vetor B:");
			for (int i = 0; i < 10; i++) B[i] = sc.nextInt();

			for (int i = 0; i < 10; i++) {
			    for (int j = 0; j < 10; j++) {
			        if (A[i] == B[j]) {
			            C[k] = A[i];
			            k++;
			            break;
			        }
			    }
			}

			System.out.println("Interseção (C):");
			for (int i = 0; i < k; i++) System.out.print(C[i] + " ");
		}
    }
}
