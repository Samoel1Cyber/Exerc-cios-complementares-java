import java.util.Scanner;

public class Exercicio12 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
			int senhas[] = new int[10];

			System.out.println("Digite as 10 senhas:");
			for (int i = 0; i < 10; i++) senhas[i] = sc.nextInt();

			System.out.println("Senhas registradas:");
			for (int i = 0; i < 10; i++) System.out.print(senhas[i] + " ");
		}
    }
}
