import java.util.Scanner;

public class Exercicio2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int altura = 1, x = 1;
		String resul = "*";

		System.out.println("Informe a altura do triângulo: ");
		altura = sc.nextInt();

		while (x <= altura) {
			System.out.println(resul);
			x++;
			resul = resul + "*";
		}

		sc.close();
	}

}
