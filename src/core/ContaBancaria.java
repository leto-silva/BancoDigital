package core;

import java.util.ArrayList;
import java.util.List;

public abstract class ContaBancaria {
	
	protected double saldo;
	private List<String> listExtrato;
	
	public ContaBancaria(double saldoInicial) {
		this.listExtrato = new ArrayList<String>();
		this.saldo = saldoInicial;
		this.listExtrato.add("=========================================");
		this.listExtrato.add("Saldo Incial: " + this.saldo);
		this.listExtrato.add("-----------------------------------------");
	}

	public abstract void impressaoExtrato();
	
	public void deposito(double valorDeposito) {
		this.saldo += valorDeposito; 	
		this.listExtrato.add("Deposito:      " + valorDeposito);
	}
		
	public void saque(double valorSaque) {
		
		if (this.saldo-valorSaque < 0) {
			throw new SaldoInvalidoException("Valor de Saque mais que saldo disponível!!!");
		}
		
		this.saldo -= valorSaque;
		this.listExtrato.add("Saque:         " + valorSaque);
	}

	public List<String> getListExtrato() {
		return listExtrato;
	}

	public void setListExtrato(String extrato) {
		this.listExtrato.add(extrato);	
	}

	public double getSaldo() {
		return saldo;
	}
	
}
