package br.edu.fadam.pi.service;

public class ExecutorDaCalculara {

	public static void main(String[] args) {
		CalculadoraSimples calculadoraSimples = new CalculadoraSimples();
		calculadoraSimples.setNumero1(1);
		calculadoraSimples.setNumero2(50);
		
		int somaDoisNumeros = calculadoraSimples.somaDoisNumeros();
		System.out.println(somaDoisNumeros);
	}
	
}
