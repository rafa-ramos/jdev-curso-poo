package br.rs.np.spark.test;

import java.util.Date;

import br.rs.np.spark.beans.Aluno;
import br.rs.np.spark.beans.Diretor;
import br.rs.np.spark.beans.Pessoa;
import br.rs.np.spark.beans.Secretario;

public class TestandoClassesFilhas {
	
	public static void main(String[] args) {
		
		Date data = new Date();
		
		
		Aluno a1 = new Aluno("Rafael",data, "12323434", "dfdjjff", "Rita", "Clesio", "UPF", "VI", data);
		
		Diretor d1 = new Diretor("Fulano", data, "123433424", "qfdsdfsa", "Mom", "Pai", "TESTE", 2, "titulacao");
		
		Secretario s1 = new Secretario("Ciclano", data, "123433424", "qfdsdfsa", "Mom", "Pai", "registro 123", "senior", "inciante", "adimin", "admin");
		
		//Não pode instanciar uma classe abstrata
		//Pessoa ps = new Pessoa("Fulano", data, "123433424", "qfdsdfsa", "Mom", "Pai");
		
		System.out.println(a1);
		System.out.println(d1);
		System.out.println(s1);
		
		System.out.println("salario é " + a1.salario());
		
		polimorfismo(a1);
		polimorfismo(d1);
		polimorfismo(s1);
		
		
	}
	
	public static void polimorfismo(Pessoa ps) {
		System.out.println("Pessoa " + ps.getNome());
	}

}
