package br.rs.np.spark.beans;

import java.util.Date;

import br.rs.np.spark.interfaces.PermitirAcesso;

public class Secretario extends Pessoa implements PermitirAcesso{
	
	private String registro;
	private String nivelCargo;
	private String experiencia;
	
	private String login, senha;
	
	public Secretario() {
	}
	
	public Secretario(String login, String senha) {
		this.login = login;
		this.senha = senha;
	}
	public Secretario(String nome, Date dataNasc, String rg, String cpf, String mae, String pai, String registro,
			String nivelCargo, String experiencia, String login, String senha) {
		super(nome, dataNasc, rg, cpf, mae, pai);
		this.registro = registro;
		this.nivelCargo = nivelCargo;
		this.experiencia = experiencia;
	}
	public String getRegistro() {
		return registro;
	}
	public void setRegistro(String registro) {
		this.registro = registro;
	}
	public String getNivelCargo() {
		return nivelCargo;
	}
	public void setNivelCargo(String nivelCargo) {
		this.nivelCargo = nivelCargo;
	}
	public String getExperiencia() {
		return experiencia;
	}
	public void setExperiencia(String experiencia) {
		this.experiencia = experiencia;
	}
		
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	@Override
	public String toString() {
		return "Secretario [registro=" + registro + ", nivelCargo=" + nivelCargo + ", experiencia=" + experiencia + "]" + "SUPERCLASSE: " + super.toString();
	}
	@Override
	public double salario() {
		// TODO Auto-generated method stub
		return 1800.80 * 0.9;
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
