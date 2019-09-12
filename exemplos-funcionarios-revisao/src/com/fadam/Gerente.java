package com.fadam;

import com.fadam.teste.Comissionavel;

public class Gerente extends Funcionario implements Comissionavel, Associavel {
	
	private double comissao;

	@Override
	public double calcularSalario() {
		return 0;
	}

	@Override
	public double calcularComissaoEspecial() {
		return 0;
	}

	@Override
	public double getComissao() {
		return getSalarioBase() * 0.3;
	}

	@Override
	public void aceitarSociedade() {
		
	}

	@Override
	public boolean isSocio() {
		return false;
	}

	@Override
	public String getNomeDoFilhoDeComissionavel() {
		return "Gerente";
	}
	
}
