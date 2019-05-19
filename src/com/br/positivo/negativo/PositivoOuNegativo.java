package com.br.positivo.negativo;
import java.util.Scanner;
public class PositivoOuNegativo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("informe o número desejado");
		int Número = entrada.nextInt();
		
		if (Número >= 0) {
		System.out.println("este número é positivo"); 
	}else {
		System.out.println("este número é negativo");
	}
	}
}
