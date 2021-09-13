package Exercio1;

import java.util.Scanner;

public class ExercioCalculo {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("1 para somar : ");
		System.out.println("2 para subtrair: ");
		System.out.println("3 para multiplicar: ");
		System.out.println("4 para dividir: ");
		
		int i = in.nextInt();
		
		System.out.println("Digite o 1° Numero:  ");
		double num1 = in.nextDouble();
		
		System.out.println("Digite o 2° Numero:  ");
		double num2 = in.nextDouble();
		
		if(i==1) {
			System.out.println(num1 + num2);
		}else {
			if (i==2) {
				System.out.println(num1 - num2);
			}else {
				if(i==3) {
					System.out.println(num1 * num2);
				}else {
					if(i==4) {
						System.out.println(num1 / num2);
					}else {
						System.out.println("operação ivalida");
					}
				}
			}
		}
	}

}
