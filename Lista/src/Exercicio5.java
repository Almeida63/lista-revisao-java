import java.util.Scanner;

public class Exercicio5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int voto;
		int numvotos1 = 0, numvotos2 = 0, numvotos3 = 0;

		System.out.println("As opções são: ");
		System.out.println("1- Candidato Jair Rodrigues. ");
		System.out.println("2- Candidato Carlos Luz. ");
		System.out.println("3- Cândidato Neves Rocha.");
		System.out.println("4- Nulo.");
		System.out.println("5- Branco.");
		System.out.println("Digite 6 para apresentar as informações.");
		System.out.println(" ");

		do {
			System.out.println("Digite o seu voto: ");
			voto = sc.nextInt();

			if (voto == 5) {
				System.out.println("Voto branco. Digite o seu cândidato: ");
				voto = sc.nextInt();
			}

			if (voto == 1) {
				numvotos1++;
			} else if (voto == 2) {
				numvotos2++;
			} else if (voto == 3) {
				numvotos3++;

			}
		} while (voto != 6);
		System.out.println("O cândidato Jair Rodriges obteve: " + numvotos1 + " votos");
		System.out.println("O cândidato Carlos Luz obteve: " + numvotos2 + " votos");
		System.out.println("O cândidato Neves Rocha obteve: " + numvotos3 + " votos");

		if (numvotos1 > numvotos2 && numvotos1 > numvotos3) {
			System.out.println("O cândidato vencedor é o Jair Rodriges.");
		} else if (numvotos2 > numvotos1 && numvotos2 > numvotos3) {
			System.out.println("O cândidato vencedor é o Carlos Luz.");
		} else if (numvotos3 > numvotos1 && numvotos3 > numvotos2) {
			System.out.println("O cândidato vencedor é o Neves Rocha.");
		}

		sc.close();

	}
}
