package br.com.fadam.ads.poo.finals;

public class ClasseParaSerHerdada {
	
	private String algoNovo;
	private static final String CONSTANTE_EXEMPLO = "NÃO MUDA!!";
	private static final Double PI = 3.14;

	public void printAlgo() {
		System.out.println("Algo do pai");
	}
	
	public void outroMetodo() {
//		CONSTANTE_EXEMPLO = "";
		System.out.println(ClasseParaSerHerdada.CONSTANTE_EXEMPLO);
	}
	
	public static void main(String[] args) {
		ClasseParaSerHerdada c = new ClasseParaSerHerdada();
		c.algoNovo = "oi";
		c.algoNovo = "sai";
		
	}
	
}
