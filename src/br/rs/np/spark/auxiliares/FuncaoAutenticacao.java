package br.rs.np.spark.auxiliares;

import br.rs.np.spark.interfaces.PermitirAcesso;

/* Somente recebe alguem que tem o contrato da interface de PermitirAcesso */
public class FuncaoAutenticacao {
	
	private PermitirAcesso permitirAcesso;
	
	public boolean autenticar() {
		return permitirAcesso.autenticar();
	}
	
	public FuncaoAutenticacao (PermitirAcesso acesso) {
		this.permitirAcesso = acesso;
	}
}
