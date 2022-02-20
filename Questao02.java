import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Questao02 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		List<Character> simbolos = Arrays.asList('!', '@', '#', '$', '%', '^', '&', '*', '(', ')', '-', '+');
		int contMaisculo = 0, contMinusculo = 0, contSimbolo = 0;

		System.out.print("Usuário: ");
		String nome = sc.nextLine();
		System.out.print("Senha: ");
		String senha = sc.nextLine();

		Character[] caracteres = new Character[senha.length()];
		for (int i = 0; i < senha.length(); i++) {
			caracteres[i] = senha.charAt(i);
			if (Character.isUpperCase(caracteres[i])) {
				contMaisculo++;
			}
			if (Character.isLowerCase(caracteres[i])) {
				contMinusculo++;
			}
			if (simbolos.contains(caracteres[i])) {
				contSimbolo++;
			}
		}
		if (senha.length() < 6 || senha.trim().equals("")) {
			System.err.println("Senha tem que ter no mínimo 6 caracteres!");
		}
		if (contMaisculo < 1) {
			System.err.println("Senha deve ter no mínimo 1 caractere maiúsculo!");
		}
		if (contMinusculo < 1) {
			System.err.println("Senha deve ter no mínimo 1 caractere minúsculo!");
		}
		if (contSimbolo < 1) {
			System.err.println("Senha deve ter no mínimo 1 caractere especial. Ex: !@#$%^&*()-+");
		}
		if (senha.length() < 3) {
			System.out.println("Para senha ser mais forte, digite mais do que 3 números.");
		}
		
		sc.close();
	}
}