package la�o;

import java.util.Scanner;

public class La�o { 

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		int x = 0; // Armazenamento da opera��o a realizaR.
		double num1, num2, resultado;

		do {

			num1 = num2 = resultado = 0;

			System.out.println("1 somar");
			System.out.println("2 subtrair");
			System.out.println("3 multiplicar");
			System.out.println("4 dividir");
			System.out.println("0 para sair");

			System.out.println("Digite codigo da opera��o");
			x = in.nextInt();

			if (x != 0) { // verifica se usuario deseja sair do programa.
				System.out.println("1� Numero: ");
				num1 = in.nextDouble();

				System.out.println("2� Numero: ");
				num2 = in.nextDouble();

				if (x == 1) {// somar
					resultado = num1 + num2;
				} else {
					if (x == 2) {// subtrair
						resultado = num1 - num2;
					} else {
						if (x == 3) {// Multiplicar
							resultado = num1 * num2;
						} else {
							if (x == 4) {
								resultado = num1 / num2;
							}
						}
					}
				}
			}
			
			System.out.println("O resultado �: " + resultado);
			System.out.println("----------------------------");

		} while (x != 0); // La�o de repeti��o.

	}
}
