package teste;
import contas.ContaCorrente;
import contas.ContaPoupanca;
import core.TipoConta;

public class TesteBanco {
	
	private static ContaPoupanca cp;
	static ContaCorrente cc;
	
	public static void main(String[] args) {
		/*
		cp = new ContaPoupanca(TipoConta.Poupanca, 1500.0);
		cp.deposito(120.0);
		cp.saque(100.0);
		cp.impressaoExtrato();
		*/
		cc = new ContaCorrente(TipoConta.Corrente, 2000.0, 0.05);
		cc.deposito(120.0);
		cc.saque(100.0);
		cc.impressaoExtrato();
		System.out.println("-----------------------------");
		System.out.println("% Rendimento:          " + cc.getRendimento());
		System.out.println("Saldo Rendimento:      " + cc.getSaldoComRendimento());
	}
	

}
