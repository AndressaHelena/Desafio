import java.util.Scanner;

public class Questao03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite uma palavra: ");
		String palavra = sc.nextLine();
		Character[] caracteres = new Character[palavra.length()];
		char[][] pares = new char[palavra.length()][];
		for (int i = 0; i < palavra.length(); i++) {
		caracteres[i] = palavra.charAt(i);
		System.out.println(caracteres[i]);
		}
		System.out.println();
		for (int i = 0; i < palavra.length(); i++) {
			for (int j = 0; j < pares[i].length; j++) {
				if (caracteres[i] == caracteres[i]) {
					System.out.println(caracteres[i] + " " +
					caracteres[i]);
					pares[i][j] = caracteres[i];
				}
			}
		}
		System.out.println(pares);
		sc.close();
	}
}
