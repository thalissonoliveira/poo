package br.com.fadam.ads.poo.exercicios;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Exercicios {
	
	public static void main(String[] args) {
		Exercicios ex = new Exercicios();
		List<Double> notas = new ArrayList<Double>();
		notas.add(10.0);
		notas.add(5.0);
		notas.add(5.0);
		
		double media = ex.calcularMediaComForEach(notas);
		System.out.println("E a média é (rufem os tambores): " + media);

		long round = Math.round(media);
		System.out.println(round);
	}

	private static void teste1() {
		Exercicios exercicio1 = new Exercicios();
		double resultado = exercicio1.somarCincoNumeros(3.0, 4.0, 25.0, 30.0, 2000.0);
		System.out.println("O resultado é " + resultado);
		String algumaCoisa = "Número ";
		String string = algumaCoisa + resultado;
		System.out.println(string);
	}
	
	public double somarCincoNumeros(double n1, double n2, double n3, double n4, double n5) {
		return n1 + n2 + n3 + n4 + n5;
	}
	
	//CAMEL CASE =  palavraParavraDois()
	public double calcularMediaComForEach(List<Double> notas) {
		double somatorioDasNotas = 0.0;
		for (Double nota : notas) {
			somatorioDasNotas = somatorioDasNotas + nota;
		}
		int totalDeNotas = notas.size();
		return somatorioDasNotas / totalDeNotas;
	}

}
