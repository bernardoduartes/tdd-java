package br.com.java.tdd.service;

import java.math.BigDecimal;

import br.com.java.tdd.modelo.Desempenho;
import br.com.java.tdd.modelo.Funcionario;

public class ReajusteService {

	public void concederReajuste(
		final Funcionario funcionario,
		final Desempenho desempenho
	) {
		final BigDecimal reajuste = desempenho.percentualReajuste();
		funcionario.reajustarSalario(reajuste);
	}
}