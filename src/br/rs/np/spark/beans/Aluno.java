package br.rs.np.spark.beans;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import br.rs.np.spark.constantes.StatusAluno;

public class Aluno extends Pessoa {
	
	private Date dataMatricula;
	private String nomeEscola;
	private String serieMatriculado;
	
	private List<Disciplina> disciplinas = new ArrayList<Disciplina>();
	
	public Aluno() {
	}
	
	public Aluno(String nome, Date dataNasc, String rg, String cpf, String mae,
			String pai, String escola, String serie, Date data) {
		
		super(nome, dataNasc, rg, cpf, mae, pai);
		
		this.dataMatricula = data;
		this.nomeEscola = escola;
		this.serieMatriculado = serie;
	}
	
	// geters and seters
	public Date getDataMatricula() {
		return dataMatricula;
	}

	public void setDataMatricula(Date dataMatricula) {
		this.dataMatricula = dataMatricula;
	}

	public String getNomeEscola() {
		return nomeEscola;
	}

	public void setNomeEscola(String nomeEscola) {
		this.nomeEscola = nomeEscola;
	}

	public String getSerieMatriculado() {
		return serieMatriculado;
	}

	public void setSerieMatriculado(String serieMatriculado) {
		this.serieMatriculado = serieMatriculado;
	}
	
	
	//fim geter e seter
 
	public List<Disciplina> getDisciplinas() {
		return disciplinas;
	}

	public void setDisciplinas(List<Disciplina> disciplinas) {
		this.disciplinas = disciplinas;
	}

	public double getMediaNota() {
		//return (disciplina.getN1() + disciplina.getN2() + disciplina.getN3() + disciplina.getN4()) / 4;
		
		double somaNotas = 0.0;
		
		for (Disciplina disciplina : disciplinas) {
			somaNotas += disciplina.getMediaNotas();
		} 
		
		return somaNotas / getDisciplinas().size();
		
	}
	
	public String getAlunoAprovado() {
		double media = getMediaNota();
		
		if (media >= 50 && media < 70) {
			return StatusAluno.RECUPERACAO;
		} else if (media >= 70) {
			return StatusAluno.APROVADO;
		} else {
			return StatusAluno.REPROVADO;
		}
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dataMatricula == null) ? 0 : dataMatricula.hashCode());
		result = prime * result + ((disciplinas == null) ? 0 : disciplinas.hashCode());
		result = prime * result + ((nomeEscola == null) ? 0 : nomeEscola.hashCode());
		result = prime * result + ((serieMatriculado == null) ? 0 : serieMatriculado.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Aluno other = (Aluno) obj;
		if (dataMatricula == null) {
			if (other.dataMatricula != null)
				return false;
		} else if (!dataMatricula.equals(other.dataMatricula))
			return false;
		if (disciplinas == null) {
			if (other.disciplinas != null)
				return false;
		} else if (!disciplinas.equals(other.disciplinas))
			return false;
		if (nomeEscola == null) {
			if (other.nomeEscola != null)
				return false;
		} else if (!nomeEscola.equals(other.nomeEscola))
			return false;
		if (serieMatriculado == null) {
			if (other.serieMatriculado != null)
				return false;
		} else if (!serieMatriculado.equals(other.serieMatriculado))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Aluno [dataMatricula=" + dataMatricula + ", nomeEscola=" + nomeEscola + ", serieMatriculado="
				+ serieMatriculado + ", disciplinas=" + disciplinas + "]" + "SUPERCLASSE: " + super.toString();
	}

	@Override
	public double salario() {
		// TODO Auto-generated method stub
		return -500.5;
	}

	
}
