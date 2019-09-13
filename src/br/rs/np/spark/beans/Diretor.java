package br.rs.np.spark.beans;

import java.util.Date;

import br.rs.np.spark.interfaces.PermitirAcesso;

public class Diretor extends Pessoa implements PermitirAcesso {
	
	private String registroEducacao;
	private int tempoDirecao;
	private String titulacao;
	
	private String login,senha;
	
	public Diretor() {
		
	}
	
	public Diretor(String nome, Date dataNasc, String rg, String cpf, String mae, String pai, String registroEducacao,
			int tempoDirecao, String titulacao) {
		super(nome, dataNasc, rg, cpf, mae, pai);
		this.registroEducacao = registroEducacao;
		this.tempoDirecao = tempoDirecao;
		this.titulacao = titulacao;
	}
	public String getRegistroEducacao() {
		return registroEducacao;
	}
	public void setRegistroEducacao(String registroEducacao) {
		this.registroEducacao = registroEducacao;
	}
	public int getTempoDirecao() {
		return tempoDirecao;
	}
	public void setTempoDirecao(int tempoDirecao) {
		this.tempoDirecao = tempoDirecao;
	}
	public String getTitulacao() {
		return titulacao;
	}
	public void setTitulacao(String titulacao) {
		this.titulacao = titulacao;
	}
	
	@Override
	public String toString() {
		return "Diretor [registroEducacao=" + registroEducacao + ", tempoDirecao=" + tempoDirecao + ", titulacao="
				+ titulacao + "]" + "SUPERCLASSE: " + super.toString();
	}
	@Override
	public double salario() {
		// TODO Auto-generated method stub
		return 2400;
	}
	@Override
	public boolean autenticar(String login, String senha) {
		this.login = login;
		this.senha = senha;
		return autenticar();
	}
	@Override
	public boolean autenticar() {
		// TODO Auto-generated method stub

		return login.equals("admin") && senha.equals("admin");
	}
	
	
}
