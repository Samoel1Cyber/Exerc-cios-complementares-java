import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
			int A[] = new int[10];

			System.out.println("Digite 10 valores:");
			for (int i = 0; i < 10; i++) A[i] = sc.nextInt();

			for (int i = 0; i < 10; i++) {
			    System.out.println("Pares até " + A[i] + ":");
			    for (int j = 0; j <= A[i]; j++) {
			        if (j % 2 == 0) System.out.print(j + " ");
			    }
			    System.out.println();
			}
		}
    }
}

