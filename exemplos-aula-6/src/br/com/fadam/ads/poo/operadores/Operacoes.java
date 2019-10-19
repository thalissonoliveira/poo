package br.com.fadam.ads.poo.operadores;

public class Operacoes {
	
	public static void main(String[] args) {
		Operacoes operacoes = new Operacoes();
		System.out.println(operacoes.somarDoisNumerosInteiros(-2, -3));
		System.out.println(operacoes.subtrairDoisNumerosInteiros(-2, -3));
		System.out.println(operacoes.dividirDoisNumerosInteiros(10.5, 2));
//		System.out.println(operacoes.calcularValorDeDelta(1, 12, -13));
//		System.out.println(operacoes.calcularX1Bhaskara(1, 12, -13));
//		System.out.println(operacoes.calcularX2Bhaskara(1, 12, -13));
	}
	
	public int somarDoisNumerosInteiros(int a, int b) {
		return a + b;
	}
	
	public int multiplicarDoisNumerosInteiros(int a, int b) {
		return a * b;
	}
	
	public int subtrairDoisNumerosInteiros(int a, int b) {
		return a - b;
	}
	
	public double dividirDoisNumerosInteiros(double a, double b) {
		return a / b;
	}
	
	public double calcularValorDeDelta(int a, int b, int c) {
		double b2 = Math.pow(b, 2);
		return b2 - 4*a*c;
	}
	
	public double calcularX1Bhaskara(int a, int b, int c) {
		double delta = calcularValorDeDelta(a, b, c);
		double menosB = -1*b;
		double raizDelta = Math.pow(delta, 1.0/2);
		double doisA = 2*a;
		return (menosB + raizDelta) / doisA;
	}
	
	public double calcularX2Bhaskara(int a, int b, int c) {
		double delta = calcularValorDeDelta(a, b, c);
		double menosB = -1*b;
		double raizDelta = Math.pow(delta, 1.0/2);
		double doisA = 2*a;
		return (menosB - raizDelta) / doisA;
	}

}
