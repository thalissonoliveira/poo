package com.fadam.teste;

public class Cliente implements Comissionavel {
	
	private double comissao;

	@Override
	public double calcularComissaoEspecial() {
		return comissao;
	}
	
	public void setComissao(double comissao) {
		this.comissao = comissao;
	}

	@Override
	public double getComissao() {
		return comissao;
	}

	@Override
	public String getNomeDoFilhoDeComissionavel() {
		return "Cliente";
	}

}
