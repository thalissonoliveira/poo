package br.edu.fadam.pi.service;

public class CalculadoraSimples {
	
	private int numero1;
	
	private int numero2;
	
	public void setNumero1(int numero1) {
		this.numero1 = numero1;
	}
	
	public int getNumero1() {
		return this.numero1;
	}
	
	public void setNumero2(int numero2) {
		this.numero2 = numero2;
	}
	
	public int getNumero2() {
		return this.numero2;
	}
	
	public int somaDoisNumeros() {
		return numero1 + numero2;
	}
	
	public void algumaCoisa() {
		int numeroMagico = 2;
		numero1 = numeroMagico + 3;
	}
	
}