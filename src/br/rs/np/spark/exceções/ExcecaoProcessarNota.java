package br.rs.np.spark.exceções;

public class ExcecaoProcessarNota extends Exception {
	
	public ExcecaoProcessarNota(String erro) {
		super("Um erro ao processar notas do aluno " + erro);
	}
}
