package br.rs.np.spark.exce��es;

public class ExcecaoProcessarNota extends Exception {
	
	public ExcecaoProcessarNota(String erro) {
		super("Um erro ao processar notas do aluno " + erro);
	}
}
