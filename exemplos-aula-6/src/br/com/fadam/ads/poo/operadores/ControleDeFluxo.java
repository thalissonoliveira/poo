package br.com.fadam.ads.poo.operadores;

public class ControleDeFluxo {

	public static void main(String[] args) {
		new ControleDeFluxo().imprimaDezNumeros();
	}
	
	public String resultadoFinal(float media) {
		if (media > 7) {
			return "Aprovado";
		} else {
			return "Prova final?";
		}
	}
	
	
	public void consumaCombustivelAteSecarTanque() {
		int tanque = 100;
		while (tanque > 0) {
			tanque = tanque - 20;
			System.out.println("esvaziando tanque: " 
			+ tanque);
		}
		System.out.println("Tanque vazio!!");
	}
	
	public void imprimaDezNumeros() {
		for (int i = 1; i <= 10; i++) {
			System.out.println("número " + i);
		}
	}
	
}
