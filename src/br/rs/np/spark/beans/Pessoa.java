package br.rs.np.spark.beans;

import java.util.Date;

// Classe Pai/Master/Supercalsse
public abstract class Pessoa {

	private String nome;
	private int idade;
	private Date dataNasc;
	private String rg, cpf;
	private String mae, pai;
	
	//método abstrato é obrigatório para as classes filhas
	public abstract double salario();
	
	public Pessoa() {
		
	}
	public Pessoa(String nome, Date dataNasc, String rg, String cpf, String mae, String pai) {
		this.nome = nome;
		//this.idade = idade;    -------- calcular idade;
		this.dataNasc = dataNasc;
		this.rg = rg;
		this.cpf = cpf;
		this.mae = mae;
		this.pai = pai;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public Date getDataNasc() {
		return dataNasc;
	}
	public void setDataNasc(Date dataNasc) {
		this.dataNasc = dataNasc;
	}
	public String getRg() {
		return rg;
	}
	public void setRg(String rg) {
		this.rg = rg;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getMae() {
		return mae;
	}
	public void setMae(String mae) {
		this.mae = mae;
	}
	public String getPai() {
		return pai;
	}
	public void setPai(String pai) {
		this.pai = pai;
	}
	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", idade=" + idade + ", dataNasc=" + dataNasc + ", rg=" + rg + ", cpf=" + cpf
				+ ", mae=" + mae + ", pai=" + pai + "]";
	}
	
	
}
