import java.util.Scanner;

public class Exercicio13 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
			int A[] = new int[10];

			System.out.println("Digite 10 números:");
			for (int i = 0; i < 10; i++) A[i] = sc.nextInt();

			boolean palindromo = true;

			for (int i = 0; i < 10; i++) {
			    if (A[i] != A[9 - i]) {
			        palindromo = false;
			        break;
			    }
			}

			if (palindromo) System.out.println("O vetor é palíndromo.");
			else System.out.println("O vetor NÃO é palíndromo.");
		}
    }
}

