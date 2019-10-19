package com.fadam.teste;

import java.util.ArrayList;
import java.util.List;

import com.fadam.Diretor;
import com.fadam.Funcionario;
import com.fadam.Gerente;

public class SistemaDeSalarioMaisComissoes {

	public static void main(String[] args) {
		Diretor diretor = new Diretor();
		diretor.setSalarioBase(4000.0);
		diretor.setGratificacao(3.0);
		diretor.calcularComissaoEspecial();
		
	    Cliente cliente = new Cliente();
	    cliente.setComissao(1000.0);
	    
	    Gerente gerente = new Gerente();
	    gerente.setSalarioBase(1000.0);
	    
	    List<Comissionavel> comissionaveis = new ArrayList<Comissionavel>();
	    comissionaveis.add(diretor);
	    comissionaveis.add(cliente);
	    comissionaveis.add(gerente);
	    
	    List<Funcionario> funcionarios = new ArrayList<Funcionario>();
	    funcionarios.add(diretor);
	    funcionarios.add(gerente);
	    
	    SistemaDeSalarioMaisComissoes sistema = new SistemaDeSalarioMaisComissoes();
	    double comissoes = sistema.processarComissoes(comissionaveis);
	    System.out.println("O total de comissões a pagar para os outros é: " + comissoes);
	}
	
	public double processarComissoes(List<Comissionavel> comissionaveis) {
		
		double valorTotalPagoPelaEmpresa = 0.0;
		for (Comissionavel comissionavel : comissionaveis) {
			System.out.println(comissionavel.getNomeDoFilhoDeComissionavel() 
					+ " tem comissão " + comissionavel.getComissao());
			valorTotalPagoPelaEmpresa += comissionavel.getComissao();
		}
		
		return valorTotalPagoPelaEmpresa;
	}
	
}
