package section2_4.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Tools {

	public static void divide(Scanner sc) throws Exception, InputMismatchException {
		double num1 = 0, num2 = 0, result = 0;
		String answer = "SIM";

		do {

			try {
				System.out.println("Informe o númerador: ");

				num1 = sc.nextDouble();

				System.out.println("Informe o denominador: ");
				num2 = sc.nextDouble();

				if (num2 == 0.0) {
					throw new Exception("Divisão por zero!");
				}
			} finally {
				num1 = 100.0;
				num2 = 15.0;
			}

			result = num1 / num2;

			System.out.println("O resultado desta divisão é: " + result);

			System.out.println("\nVocê deseja realizar uma nova divisão? (SIM/NÃO)");
			answer = sc.next();
			while (!answer.equalsIgnoreCase("SIM") && !answer.equalsIgnoreCase("NÃO")) {
				System.out.println("Você precisa digitar SIM ou NÂO!");
				answer = sc.next();
			}
		} while (answer.equalsIgnoreCase("SIM"));

		System.out.println("Programa concluído!");
		sc.close();
	}
}
