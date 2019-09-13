package br.rs.np.spark.beans;

import java.util.Arrays;

public class Disciplina {
	
	private double[] nota = new double[4];
	private String disciplina;
	
	public Disciplina( ) {
		
	}
	
	public Disciplina(double[] nota, String disciplina) {
		super();
		this.nota = nota;
		this.disciplina = disciplina;
	}
	public double[] getNota() {
		return nota;
	}
	public void setNota(double[] nota) {
		this.nota = nota;
	}
	public String getDisciplina() {
		return disciplina;
	}
	public void setDisciplina(String disciplina) {
		this.disciplina = disciplina;
	}
	
	public double getMediaNotas() {
		
		int media = 0;
		
		for (double d : nota) {
			media += d;
		}
		
		return media / nota.length;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((disciplina == null) ? 0 : disciplina.hashCode());
		result = prime * result + Arrays.hashCode(nota);
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
		Disciplina other = (Disciplina) obj;
		if (disciplina == null) {
			if (other.disciplina != null)
				return false;
		} else if (!disciplina.equals(other.disciplina))
			return false;
		if (!Arrays.equals(nota, other.nota))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Disciplina [nota=" + nota + ", disciplina=" + disciplina + "]" + "SUPERCLASSE: " + super.toString();
	}
	
	
	
}
