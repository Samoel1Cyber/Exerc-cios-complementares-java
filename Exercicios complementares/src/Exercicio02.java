import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
			int A[] = new int[5];

			System.out.println("Digite 5 números:");
			for (int i = 0; i < 5; i++) A[i] = sc.nextInt();

			for (int i = 0; i < 5; i++) {
			    System.out.println("\nTabuada de " + A[i] + ":");
			    for (int j = 0; j <= 10; j++) {
			        System.out.println(A[i] + " x " + j + " = " + (A[i] * j));
			    }
			}
		}
    }
}

