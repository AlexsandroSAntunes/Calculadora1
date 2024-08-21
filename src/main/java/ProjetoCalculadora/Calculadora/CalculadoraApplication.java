package ProjetoCalculadora.Calculadora;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class CalculadoraApplication {

	public static void main(String[] args) {
		SpringApplication.run(CalculadoraApplication.class, args);

		Scanner scanner = new Scanner(System.in);

		System.out.print("Digite o primeiro número: ");
		double num1 = scanner.nextDouble();

		System.out.print("Digite o segundo número: ");
		double num2 = scanner.nextDouble();

		System.out.print("Digite a operação (+, -, /, *): ");
		char operator = scanner.next().charAt(0);

		scanner.close();

		double result;

		switch (operator) {
			case '+':
				result = num1 + num2;
				break;
			case '-':
				result = num1 - num2;
				break;
			case '*':
				result = num1 * num2;
				break;
			case '/':
				if (num2 != 0) {
					result = num1 / num2;
				} else {
					System.out.println("Divisão por zero não é permitida.");
					return;
				}
				break;
			default:
				System.out.println("Operação inválida");
				return;
		}

		System.out.println(num1 + " " + operator + " " + num2 + " = " + result);
	}
}
