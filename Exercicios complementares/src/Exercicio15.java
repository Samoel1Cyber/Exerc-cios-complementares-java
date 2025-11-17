import java.util.Scanner;

public class Exercicio15 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
			int A[] = new int[10];
			int B[] = new int[10];
			int C[] = new int[10];

			System.out.println("Digite os 10 valores do vetor A:");
			for (int i = 0; i < 10; i++) A[i] = sc.nextInt();

			System.out.println("Digite os 10 valores do vetor B:");
			for (int i = 0; i < 10; i++) B[i] = sc.nextInt();

			for (int i = 0; i < 10; i++) {
			    if (A[i] > B[i])
			        C[i] = 1;
			    else if (A[i] == B[i])
			        C[i] = 0;
			    else
			        C[i] = -1;
			}

			System.out.println("Vetor C:");
			for (int i = 0; i < 10; i++) System.out.print(C[i] + " ");
		}
    }
}
