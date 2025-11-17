import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
			int A[] = new int[20];
			int B[] = new int[20];

			System.out.println("Digite os 20 elementos do vetor A:");
			for (int i = 0; i < 20; i++) A[i] = sc.nextInt();

			int inicio = 0;
			int fim = 19;

			for (int i = 0; i < 20; i++) {
			    if (A[i] % 2 == 0) {
			        B[inicio] = A[i];
			        inicio++;
			    } else {
			        B[fim] = A[i];
			        fim--;
			    }
			}

			System.out.println("Vetor B (pares no início e ímpares no fim):");
			for (int i = 0; i < 20; i++) System.out.print(B[i] + " ");
		}
    }
}


