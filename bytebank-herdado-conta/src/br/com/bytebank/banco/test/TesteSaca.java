package br.com.bytebank.banco.test;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;

//Full Qualifie Name => FQN
//O verdadeiro nome qui da classe seria "modelo.TestaSaca"
public class TesteSaca {

	public static void main(String[] args) {

		Conta conta = new ContaCorrente(123, 321);
		
		conta.deposita(200.0);
		conta.saca(190.0);
		
		System.out.println(conta.getSaldo()	);
	}

}
