package br.rs.np.spark.test;

import javax.swing.JOptionPane;

import br.rs.np.spark.beans.Aluno;
import br.rs.np.spark.beans.Disciplina;

public class TesteArray {
	
	public static void main(String[] args) {
		
		double[] notas = {8.8,9.8,10,7};
		double[] notasLogicas = {10,5,9,1.5};
		
		
		Aluno aluno = new Aluno();
		aluno.setNome("Alex");
		aluno.setNomeEscola("P� Serraglio");
			
	
		Disciplina disciplina = new Disciplina();
		disciplina.setDisciplina("Curso de Java");
		disciplina.setNota(notas);
		
		Disciplina disciplina2 = new Disciplina();
		disciplina2.setDisciplina("Curso de l�gica");
		disciplina2.setNota(notasLogicas);
		
		aluno.getDisciplinas().add(disciplina);
		aluno.getDisciplinas().add(disciplina2);
		
		//--------------------------------------
		
		Aluno[] arrayAlunos = new Aluno[1];
		
		arrayAlunos[0] = aluno;
		
		for (Aluno a : arrayAlunos) {
			System.out.println("Nome do aluno �: " + a.getNome());
			
			for (Disciplina d : a.getDisciplinas()) {
				System.out.println("Nome da disciplina � : " + d.getDisciplina());
				
				for (int pos = 0; pos < d.getNota().length; pos++) {
					System.out.println("A nota n�mero : " + pos + " � igual = " + d.getNota()[pos]);
				}
			}
		}

		
	}

}
