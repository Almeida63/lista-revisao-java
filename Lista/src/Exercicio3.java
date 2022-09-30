import java.util.Scanner;

public class Exercicio3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char resposta, sexo;
		int quantidadesim = 0, quantidadenao = 0, quantidademulheres = 0;

		System.out.println("Sexo: ");
		System.out.println("Feminino = f  Masculino = m");
		System.out.println(" ");
		System.out.println("Resposta: ");
		System.out.println("Sim = s  Não = n ");
		System.out.println(" ");

		for (int i = 1; i <= 10; i++) {
			System.out.println("Digite o seu sexo: ");
			sexo = sc.next().charAt(0);

			System.out.println("Você gostou do produto? ");
			resposta = sc.next().charAt(0);

			if (resposta == 's') {
				quantidadesim++;
			} else if (resposta == 'n') {
				quantidadenao++;
			}

			if (resposta == 's' && sexo == 'f') {
				quantidademulheres++;
			}
		}

		System.out.println("Resultado da pesquisa: Houve " + quantidadesim + " respostas positivas.");
		System.out.println("Resultado da pesquisa: Houve " + quantidadenao + " respostas negativas");
		System.out.println("Resultado da pesquisa: Houve " + quantidadesim + " respostas positivas.");
		System.out.println("Resultado da pesquisa: Houve " + quantidademulheres + " respostas femininas positivas.");

		sc.close();
	}

}
