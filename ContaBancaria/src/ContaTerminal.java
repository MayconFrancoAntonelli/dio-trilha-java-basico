
import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {

	public static void main(String[] args) {
		/*
		 * importar a classe Scaner Exibir as msg para os usuarios informar os dados
		 * obter pelo scanner os valores diigitados apresentar os valores digitados
		 */
		String mensagem;
		Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

		System.out.println("Por favor, digite o número da Agência !");
		String agencia = scanner.next();

		System.out.println("Por favor, digite o número da Conta !");
		int numero = scanner.nextInt();

		System.out.println("Por favor, digite seu nome !");
		String nome = scanner.next().toUpperCase();

		System.out.println("Por favor, digite o Saldo da Conta!");
		double saldo = scanner.nextDouble();

		mensagem = "Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência e: " + agencia
	                      + ", conta: " + numero + " e seu saldo: " + saldo + "já está disponível para saque";
 
		System.out.println(mensagem);
		
	}

}
