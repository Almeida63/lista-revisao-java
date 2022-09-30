import java.util.Scanner;

public class Exercicio1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int resposta1, resposta2, resposta3, resposta4, resposta5;
		int classificacao;

		System.out.println("1-Sim  0-Não");
		System.out.println("");

		System.out.println("1- Telefonou para a vítima? ");
		resposta1 = sc.nextInt();

		System.out.println("2- Esteve no local do crime? ");
		resposta2 = sc.nextInt();

		System.out.println("3- Mora perto da vitima? ");
		resposta3 = sc.nextInt();

		System.out.println("4- Devia para a vítima ");
		resposta4 = sc.nextInt();

		System.out.println("5- Já trabalhou com a vítima ");
		resposta5 = sc.nextInt();

		classificacao = resposta1 + resposta2 + resposta3 + resposta4 + resposta5;

		if (classificacao == 0 || classificacao == 1) {
			System.out.println("Classificação: Inocente.");
		} else if (classificacao == 2) {
			System.out.println("Classificação: Suspeito.");
		} else if (classificacao == 3 || classificacao == 4) {
			System.out.println("Classificação: Cúmplice.");
		} else if (classificacao == 5) {
			System.out.println("Classificação: Assassino.");
		}
		sc.close();
	}

}
