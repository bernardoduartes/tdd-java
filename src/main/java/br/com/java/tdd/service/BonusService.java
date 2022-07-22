package br.com.java.tdd.service;

import java.math.BigDecimal;
import java.math.RoundingMode;

import br.com.java.tdd.modelo.Funcionario;

public class BonusService {
	
	public static final String NAO_PODE_RECEBER_BONUS_EXCEPTION = "Funcionário com salário maior do que R$10000 nao pode receber bonus!";

	public BigDecimal calcularBonus(Funcionario funcionario) {
		BigDecimal valor = funcionario.getSalario().multiply(new BigDecimal("0.1"));
		if (valor.compareTo(new BigDecimal("1000")) > 0)
			throw new IllegalArgumentException(NAO_PODE_RECEBER_BONUS_EXCEPTION);
		return valor.setScale(2, RoundingMode.HALF_UP);
	}
}