package br.com.erickfreire.arredondandonumeros2;

import java.util.Scanner;

/**
 * Programa em Java que arredonda n�meros
 * @author Erick Freire
 * @version 1 Criado em 29-04-2021 as 22:36
 */

public class ArredondandoNumeros2 {

	public static void main(String[] args) {
		
		int opcao;
		double numero;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Programa converte arredonda valores!");
		
		System.out.print("Informe o valor para ser arredondado: ");
		numero = entrada.nextDouble();
		
		System.out.printf("Escolha uma op��o: %n%n"
				        + "1 - Para o inteiro mais pr�ximo%n"
				        + "2 - Para o decimal mais pr�ximo%n"
				        + "3 - Para o cent�simo mais pr�ximo%n"
				        + "4 - Para o mil�simo mais pr�ximo%n");
		opcao = entrada.nextInt();
		
		switch(opcao) {
		case 1:
			inteiro(numero);
			break;
		case 2:
			decimal(numero);
			break;
		case 3:
			centesimo(numero);
			break;
		case 4:
			milesimo(numero);
			break;
		default:
			System.out.println("Op��o Inv�lida - reinicie o programa");
			break;
		}

	}
	
	public static void inteiro(double n) {
		double res = Math.floor(n + 0.5);
		System.out.printf("%n%nO valor anterior �: %f o valor arredondado �: %f",n, res);
	}
	
    public static void decimal(double n) {
    	double res = Math.floor(n * 10 + 0.5) / 10;
		System.out.printf("%n%nO valor anterior �: %f o valor arredondado �: %f",n, res);
	}

    public static void centesimo(double n) {
    	double res = Math.floor(n * 100 + 0.5) / 100;
		System.out.printf("%n%nO valor anterior �: %f o valor arredondado �: %f",n, res);
    }

    public static void milesimo(double n) {
    	double res = Math.floor(n * 1000 + 0.5) / 1000;
		System.out.printf("%n%nO valor anterior �: %f o valor arredondado �: %f",n, res);
    }

}
