package pacoteNotion;

public class Aula03 {

	public static final double PI = 3.14159;

	public static void main(String[] args) {

		String nome = "José Ari";
		int idade = 32;
		double altura = 1.79;

		System.out.printf("Meu nome é: %s %n", nome); // %s para String
		System.out.printf("Minha idade é: %d %n", idade); // %d para Inteiro
		System.out.printf("Minha altura é: %.2f%n", altura);// %f para float ou double

		System.out.printf("O valore de Pi é: %.4f%n", PI);

	}
}
