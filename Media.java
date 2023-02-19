package ALUNO;

import java.util.Arrays;

public class IDK {
	public String nome;
	public int codmat;
	public String cpf;
	public char sexo;
	public double nota1;
	public double nota2;
	public double nota3;
	
	public IDK(String nome, int codmat, String cpf, char sexo, double nota1, double nota2, double nota3) {
		super();
		this.nome = nome;
		this.codmat = codmat;
		this.cpf = cpf;
		this.sexo = sexo;
		this.nota1 = nota1;
		this.nota2 = nota2;
		this.nota3 = nota3;
	}
	
	public void imprime_Aluno() {
		System.out.println("Nome: " + this.nome);
		System.out.println("Código de Matrícula: " + this.codmat);
		System.out.println("CPF: " + this.cpf);
		System.out.println("Sexo:  " + this.sexo);
		System.out.println("Nota1: " + this.nota1);
		System.out.println("Nota2: " + this.nota2);
		System.out.println("Nota3: " + this.nota3);
	}
	public void imprime_Sexo() {
		if (this.sexo =='M')
			System.out.println("Masculino");
		else
			System.out.println("Feminino");
	}

    public double Media_Aluno() {
    	
    	double[] tabNotas = new double [3]; 
    	tabNotas[0] = this.nota1;
    	tabNotas[1] = this.nota2;
    	tabNotas[2] = this.nota3;
    	
    	Arrays.sort(tabNotas);
    	return(tabNotas[1] + tabNotas[2]) / 2.0;    	
    	
    }

}
