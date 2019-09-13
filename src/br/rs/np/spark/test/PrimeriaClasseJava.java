package br.rs.np.spark.test;

import java.util.List;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

import javax.swing.JOptionPane;

import com.sun.javafx.geom.transform.GeneralTransform3D;

import br.rs.np.spark.auxiliares.FuncaoAutenticacao;
import br.rs.np.spark.beans.Aluno;
import br.rs.np.spark.beans.Disciplina;
import br.rs.np.spark.beans.Secretario;
import br.rs.np.spark.constantes.StatusAluno;
import br.rs.np.spark.interfaces.PermitirAcesso;

public class PrimeriaClasseJava {
	
	public static void lerArquivo() throws FileNotFoundException{
		
			File fil = new File("c://naoexiste.txt");
			//Scanner input = new Scanner(fil);
	}

	public static void main(String[] args) {

		try {
			
			lerArquivo(); 
			
		    String login = JOptionPane.showInputDialog("Informe o Login");
			String senha = JOptionPane.showInputDialog("Informe o Senha");
			
			// true ou false
			PermitirAcesso permitirAcesso = new Secretario(login, senha);

			if (new FuncaoAutenticacao(permitirAcesso).autenticar()) {

				List<Aluno> alunos = new ArrayList<Aluno>();
				//é uma lista que contem uma chave que identifica uma sequencia de valores 
				HashMap<String, List<Aluno>> maps = new HashMap<String, List<Aluno>>();
				System.out.println();
				System.out.println();

				Disciplina disc1 = new Disciplina();
				Disciplina disc2 = new Disciplina();

				maps.put(StatusAluno.APROVADO, new ArrayList<Aluno>());
				maps.put(StatusAluno.RECUPERACAO, new ArrayList<Aluno>());
				maps.put(StatusAluno.REPROVADO, new ArrayList<Aluno>());

				for (Aluno a : alunos) {
					if (a.getAlunoAprovado().equalsIgnoreCase(StatusAluno.APROVADO)) {
						maps.get(StatusAluno.APROVADO).add(a);
					} else if (a.getAlunoAprovado().equalsIgnoreCase(StatusAluno.RECUPERACAO)) {
						maps.get(StatusAluno.RECUPERACAO).add(a);
					} else {
						maps.get(StatusAluno.REPROVADO).add(a);
					}
				}

				System.out.println("--------------- Lista dos Aprovados -------------");
				for (Aluno aA : maps.get(StatusAluno.APROVADO)) {
					System.out.println("Resultado = " + aA.getAlunoAprovado() + "Com média: " + aA.getMediaNota());
				}

				System.out.println("--------------- Lista dos Recuperação -------------");
				for (Aluno aA : maps.get(StatusAluno.RECUPERACAO)) {
					System.out.println("Resultado = " + aA.getAlunoAprovado() + "Com média: " + aA.getMediaNota());
				}

				System.out.println("--------------- Lista dos Reporvados -------------");
				for (Aluno aA : maps.get(StatusAluno.REPROVADO)) {
					System.out.println("Resultado = " + aA.getAlunoAprovado() + "Com média: " + aA.getMediaNota());
				}

			} else {
				JOptionPane.showMessageDialog(null, "login ou senha inválidos");
			}
		} catch (NumberFormatException e) {
			e.printStackTrace(); // imprime o erro no console
			
			for (int count=0; count <= e.getStackTrace().length; count++) {
				System.out.println("Classe de erro : " + e.getStackTrace()[count].getClassName());
				System.out.println("Classe de erro : " + e.getStackTrace()[count].getMethodName());
				System.out.println("Classe de erro : " + e.getStackTrace()[count].getLineNumber());
			}
			
			JOptionPane.showMessageDialog(null, "Erro de conversão de número " + e.getMessage());
		} catch (NullPointerException e) {
			JOptionPane.showMessageDialog(null, "Erro null");
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Erro da exceção customizada " + e.getMessage());
		} finally { //sempre é executado
			JOptionPane.showMessageDialog(null, "caiu no bloco finally");
		} 
	}
}
