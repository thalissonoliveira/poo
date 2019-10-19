package br.com.fadam.ads.poo.castings;

public class ChecadorDeCasting {
	
	public static void main(String[] args) {
		FilhoUm filhoUm = new FilhoUm();
		FilhoDois filhoDois = new FilhoDois();
		Pai pai = filhoDois;
		
		Pai paiCinc = new FilhoDois();
		System.out.println(pai.dizesQuemEs());
//		pai = filhoUm;
		
//		System.out.println(pai.dizesQuemEs());
		
		Pai p = filhoUm;
		
		FilhoDois f2 = (FilhoDois) p;//DÁ ERRO AO RODAR (ClassCastException)
		
		FilhoDois filhoDepoisDoCastDoPai = (FilhoDois) pai;
		System.out.println(filhoDepoisDoCastDoPai.dizesQuemEs());
		pai = filhoDois;
//		filhoDepoisDoCastDoPai = (FilhoDois) pai;
//		
		pai = new FilhoUm();
		
		System.out.println(pai.dizesQuemEs());
//		
//		FilhoDois novoFilhoDois = (FilhoDois) pai;
		
		if (pai instanceof Pai) {
			System.out.println("Pai");
		}
		
		if (pai instanceof FilhoUm) {
			System.out.println("Sou filho 1");
		}
		
		if (pai instanceof FilhoDois) {
			System.out.println("Sou filho 2");
		}
		
//		System.out.println(novoFilhoDois.dizesQuemEs());
		
//		FilhoDois filhoDois = filhoUm;//Erro de compilação
		
	}

}
