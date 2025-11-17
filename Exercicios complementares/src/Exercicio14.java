import java.util.Scanner;

public class Exercicio14 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
			int A[] = new int[10];
			int B[] = new int[10];

			System.out.println("Digite 10 valores:");
			for (int i = 0; i < 10; i++) A[i] = sc.nextInt();

			for (int i = 0; i < 10; i++) {
			    if (A[i] % 2 == 0)
			        B[i] = 1;
			    else
			        B[i] = 0;
			}

			System.out.println("Vetor B:");
			for (int i = 0; i < 10; i++) System.out.print(B[i] + " ");
		}
    }
}

