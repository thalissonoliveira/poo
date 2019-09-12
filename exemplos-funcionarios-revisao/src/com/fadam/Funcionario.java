package com.fadam;

public abstract class Funcionario {
	
	private String nome;
	
	private String numeroDocumento;
	
	private double salarioBase;
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNumeroDocumento() {
		return numeroDocumento;
	}

	public void setNumeroDocumento(String numeroDocumento) {
		this.numeroDocumento = numeroDocumento;
	}

	public double getSalarioBase() {
		return salarioBase;
	}

	public void setSalarioBase(double salarioBase) {
		this.salarioBase = salarioBase;
	}

	public abstract double calcularSalario();
	
	public boolean isComissionavel() {
		return false;
	}

}
