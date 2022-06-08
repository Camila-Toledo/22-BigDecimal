package br.com.glandata;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Main {

	public static void main(String[] args) {

		// c�lculo incorreto devido convers�o bin�ria
		// double valor = 0.3;
		// System.out.println(valor + valor + valor);

		// BigDecimal numeroA = new BigDecimal("0.3");
		// System.out.println(numeroA.add(numeroA).add(numeroA).add(numeroA));

		// Integer numeroB = 5;
		// BigDecimal numeroC = new BigDecimal(5 + numeroB);
		// System.out.println(numeroC);

		BigDecimal numeroA = new BigDecimal("5");
		BigDecimal numeroB = new BigDecimal("27");

		System.out.println("Subtra��o");
		System.out.println(numeroA.subtract(numeroB));

		System.out.println("\nAdi��o");
		System.out.println(numeroA.add(numeroB));

		System.out.println("\nCompara��o");
		System.out.println(numeroA.compareTo(numeroB));

		System.out.println("\nDivis�o");
		System.out.println(numeroA.divide(numeroB, 2, RoundingMode.DOWN));

		System.out.println("\nM�nimo");
		System.out.println(numeroA.max(numeroB));

		System.out.println("\nM�ximo");
		System.out.println(numeroA.min(numeroB));

		System.out.println("\nPot�ncia");
		System.out.println(numeroA.pow(5));

		System.out.println("\nMultiplica��o");
		System.out.println(numeroA.multiply(numeroB));

		System.out.println("\nInverte sinal");
		System.out.println(numeroA.negate());

		System.out.println("\nValor absoluto");
		System.out.println(numeroA.abs());
	}

}
