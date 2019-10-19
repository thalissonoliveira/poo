package br.com.fadam.ads.poo.operadores;

public class Operadores {
	
	public static void main(String[] args) {
		System.out.println(verificaSeIgual(20, 21));
		System.out.println(verificaSeDiferente(20, 21));
		System.out.println(verificaSeMaior(20, 21));
		System.out.println(verificaSeMenor(20, 21));
		System.out.println(verificaSeMenorOuIgual(20, 21));
		System.out.println(verificaSeMaiorOuIgual(20, 21));
	}

	private static boolean verificaSeMaiorOuIgual(int i, int j) {
		return i >= j;
	}

	private static boolean verificaSeMenorOuIgual(int i, int j) {
		return i <= j;
	}

	private static boolean verificaSeMenor(int i, int j) {
		return i < j;
	}

	private static boolean verificaSeMaior(int i, int j) {
		return i > j;
	}

	private static boolean verificaSeDiferente(int i, int j) {
		return i != j;
	}

	private static boolean verificaSeIgual(int i, int j) {
		return i == j;
	}
}
