package br.rs.np.spark.interfaces;

//Contrato de autentica��o
public interface PermitirAcesso {
	
	public boolean autenticar(String login, String senha);
	
	public boolean autenticar();
}
