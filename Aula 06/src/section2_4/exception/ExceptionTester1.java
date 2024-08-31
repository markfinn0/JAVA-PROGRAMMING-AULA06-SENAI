package section2_4.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionTester1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
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
			} catch (InputMismatchException e) {
				System.out.println("Você precisa digitar um valor numérico, sua anta!");
//				System.out.println(e.getMessage());
				sc.nextLine();
				continue;
			} catch (NumberFormatException e) {
//				System.out.println("O formato do número não está adequado!");
				System.out.println(e.getMessage());
//				e.printStackTrace();
				sc.nextLine();
				continue;
			} catch (Exception e) {
//				System.out.println("Sua mula, digite um valor válido!");
				System.out.println(e.getMessage());
//				e.printStackTrace();
				sc.nextLine();
				continue;
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
