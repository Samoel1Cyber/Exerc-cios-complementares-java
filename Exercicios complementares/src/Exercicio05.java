import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
			int A[] = new int[10];

			System.out.println("Digite 10 valores:");
			for (int i = 0; i < 10; i++) A[i] = sc.nextInt();

			for (int i = 0; i < 10; i++) {
			    System.out.println("Divisores de " + A[i] + ":");
			    for (int j = 1; j <= A[i]; j++) {
			        if (A[i] % j == 0) System.out.print(j + " ");
			    }
			    System.out.println();
			}
		}
    }
}
