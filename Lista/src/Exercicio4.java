import java.util.Scanner;

public class Exercicio4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int id, quantidade = 0;
		double media;
		float peso, gordinho = Integer.MIN_VALUE, magrinho = Integer.MAX_VALUE;

		do {
			System.out.println("Digite a id do Frango: ");
			id = sc.nextInt();
			quantidade++;

			System.out.println("Digite o peso do Frango: ");
			peso = sc.nextFloat();

			if (peso > gordinho) {
				gordinho = peso;
			}

			if (peso < magrinho) {
				magrinho = peso;
			}

			media = (quantidade + quantidade) / quantidade;

		} while (id != 0 && peso != 0);
		System.out.println("");
		System.out.println("São: " + (quantidade - 1) + " frangos.");
		System.out.println("O mais gordinho pesa: " + gordinho);
		// System.out.println("O mais magrinho pesa: " + magrinho);
		System.out.println("A média dos frangos é: " + media);

		sc.close();
	}

}
