package com.fadam;

import com.fadam.teste.Comissionavel;

/**
 * 
 * Classe que ajuda no cálculo de comissão.
 * 
 * @author Thalisson
 *
 */
public class Diretor extends Funcionario implements Comissionavel, Associavel {
	
	private double comissao;
	private double gratificacao;
	private boolean socio;

	@Override
	public double calcularSalario() {
		return (getSalarioBase() + gratificacao) * (1 + comissao);
	}

	@Override
	public double calcularComissaoEspecial() {
		return gratificacao * getSalarioBase();
	}

	@Override
	public double getComissao() {
		return gratificacao * getSalarioBase();
	}
	
	public double getGratificacao() {
		return gratificacao;
	}

	public void setGratificacao(double gratificacao) {
		this.gratificacao = gratificacao;
	}

	@Override
	public void aceitarSociedade() {
		socio = true;
	}

	@Override
	public boolean isSocio() {
		return socio;
	}

	@Override
	public String getNomeDoFilhoDeComissionavel() {
		return "Diretor";
	}
	
	@Override
	public boolean isComissionavel() {
		return true;
	}

}
