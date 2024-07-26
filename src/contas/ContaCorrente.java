package contas;

import core.TipoConta;

public class ContaCorrente extends ContaPoupanca{
	
	private double rendimento;
	private double saldoComRendimento;
	
	public ContaCorrente(TipoConta tipoConta, double saldoInicial, double rendimento) {
		super(tipoConta, saldoInicial);
		this.rendimento = rendimento;		
	}
	
	private void calcularRendimento() {
		this.saldoComRendimento = this.saldo * this.rendimento;
	}
	
	public double getSaldoComRendimento() {
		return saldoComRendimento;
	}
	
	@Override
	public void deposito(double valorDeposito) {
		this.calcularRendimento();
	}

	public double getRendimento() {
		return rendimento;
	}

	public void setRendimento(double rendimento) {
		this.rendimento = rendimento;
	}
	

}
