package br.com.glandata;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Main {

	public static void main(String[] args) {

		// cálculo incorreto devido conversão binária
		// double valor = 0.3;
		// System.out.println(valor + valor + valor);

		// BigDecimal numeroA = new BigDecimal("0.3");
		// System.out.println(numeroA.add(numeroA).add(numeroA).add(numeroA));

		// Integer numeroB = 5;
		// BigDecimal numeroC = new BigDecimal(5 + numeroB);
		// System.out.println(numeroC);

		BigDecimal numeroA = new BigDecimal("5");
		BigDecimal numeroB = new BigDecimal("27");

		System.out.println("Subtração");
		System.out.println(numeroA.subtract(numeroB));

		System.out.println("\nAdição");
		System.out.println(numeroA.add(numeroB));

		System.out.println("\nComparação");
		System.out.println(numeroA.compareTo(numeroB));

		System.out.println("\nDivisão");
		System.out.println(numeroA.divide(numeroB, 2, RoundingMode.DOWN));

		System.out.println("\nMínimo");
		System.out.println(numeroA.max(numeroB));

		System.out.println("\nMáximo");
		System.out.println(numeroA.min(numeroB));

		System.out.println("\nPotência");
		System.out.println(numeroA.pow(5));

		System.out.println("\nMultiplicação");
		System.out.println(numeroA.multiply(numeroB));

		System.out.println("\nInverte sinal");
		System.out.println(numeroA.negate());

		System.out.println("\nValor absoluto");
		System.out.println(numeroA.abs());
	}

}
