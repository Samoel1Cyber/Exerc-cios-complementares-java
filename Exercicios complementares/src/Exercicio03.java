import java.util.Scanner;

public class Exercicio03 {

    static boolean primo(int n) {
        if (n <= 1) return false;
        for (int i = 2; i <= Math.sqrt(n); i++)
            if (n % i == 0) return false;
        return true;
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
			int A[] = new int[10];

			System.out.println("Digite 10 números:");
			for (int i = 0; i < 10; i++) A[i] = sc.nextInt();

			for (int i = 0; i < 10; i++) {
			    if (primo(A[i]))
			        System.out.println(A[i] + " é primo.");
			    else
			        System.out.println(A[i] + " NÃO é primo.");
			}
		}
    }
}



