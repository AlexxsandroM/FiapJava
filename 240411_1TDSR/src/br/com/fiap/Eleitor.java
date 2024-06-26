package br.com.fiap;

import java.time.LocalDate;

public class Eleitor {
	
	private String nome;
	private int anoNascimento;
	private int numTitulo;
	private int zona;
	private int secao;
	//construtor vazio gcfs, construtor com passagem de parâmetros gcuf
	public Eleitor() {
		
	}
	public Eleitor(String nome, int anoNascimento, int numTitulo, int zona, int secao) {
		this.nome = nome;
		setAnoNascimento(anoNascimento);
		this.numTitulo = numTitulo;
		this.zona = zona;
		this.secao = secao;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getAnoNascimento() {
		return anoNascimento;
	}
	public void setAnoNascimento(int anoNascimento) {
		
		try {
			LocalDate dataAtual = LocalDate.now();
			int anoAtual = dataAtual.getYear();
			
			if (anoNascimento >= 1900 && (anoAtual - 16) < anoAtual) {
				this.anoNascimento = anoNascimento;				
			} else {
				throw new Exception("Valor inválido.");
			}
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	public int getNumTitulo() {
		return numTitulo;
	}
	public void setNumTitulo(int numTitulo) {
		this.numTitulo = numTitulo;
	}
	public int getZona() {
		return zona;
	}
	public void setZona(int zona) {
		this.zona = zona;
	}
	public int getSecao() {
		return secao;
	}
	public void setSecao(int secao) {
		this.secao = secao;
	}
	
	public int calcularIdade(int anoAtual) {
		return  anoAtual - anoNascimento;
	}

}
