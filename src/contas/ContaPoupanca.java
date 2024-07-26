package contas;

import core.ContaBancaria;
import core.TipoConta;

public class ContaPoupanca extends ContaBancaria {
	private TipoConta tipoConta;

	public ContaPoupanca(TipoConta tipoConta, double saldoInicial) {
		super(saldoInicial);
		this.tipoConta = tipoConta;		
	}

	@Override
	public void impressaoExtrato() {
		// TODO Auto-generated method stub
		for (String s: this.getListExtrato()) {
		     System.out.println(s);
	    }
		System.out.println("-----------------------------------------");
		System.out.println("Saldo Atual:  " + this.getSaldo());
		System.out.println("*****************************************");
	}
		
	
}
