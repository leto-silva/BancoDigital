package core;

public enum TipoConta {
   Poupanca("P",  "01"),
   Corrente("CC", "02");
   
   private final String sigla;
   private final String codigo;
	
   TipoConta(final String sigla, final String codigo){
	   this.sigla = sigla;
	   this.codigo = codigo;
   }

	public String getSigla() {
		return sigla;
	}
	
	public String getCodigo() {
		return codigo;
	}
   
}
