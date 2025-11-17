import java.util.Scanner;

public class Exercicio07 {

    static long fatorial(int n) {
        long fat = 1;
        for (int i = 1; i <= n; i++) fat *= i;
        return fat;
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
			int A[] = new int[15];
			long B[] = new long[15];

			System.out.println("Digite 15 valores:");
			for (int i = 0; i < 15; i++) A[i] = sc.nextInt();

			for (int i = 0; i < 15; i++) {
			    B[i] = fatorial(A[i]);
			}

			System.out.println("Vetor B (fatoriais):");
			for (int i = 0; i < 15; i++) System.out.print(B[i] + " ");
		}
    }
}
